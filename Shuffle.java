
class Shuffle{
	/* Random number between lower and higher, inclusive */
	int rand(int lower, int higher){
		return lower + (int)(Math.random() * (higher - lower + 1));
	}	

	int[] shuffleArrayRecursively(int[] cards, int i){
		if(i == 0) return cards;

		shuffleArrayRecursively(cards, i-1); //Shuffle earlier part
		int k = rand(0, i); //Pack random index to swap with

		/* Swap element k and i */
		int temp = cards[k];
		cards[k] = cards[i];
		cards[i] = temp;

		/* Returned shuffled array */
		return cards;
	}

	public static void main(String[] args){
		Shuffle obj = new Shuffle();
		int count = 10;
		int cards[] = new int[count];
		for(int i=0 ; i<count ; i++){
			cards[i] = i;
		}
		
		
		obj.shuffleArrayRecursively(cards, count);
	}

}