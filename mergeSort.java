 public class MergeSort{
 
 /***************************************************************************************************************************/
 /************************************************* Merge sort function **************************************************/
	private void merge(int arr[], int left, int middle, int right){
	 
		/** Find sizes of two sub arrays to be merged *********************************************************************/
			// Account for including the middle element by adding 1
			int leftSize = (middle - left) + 1;
			int rightSize = (right - middle);

		/** Create temp arrays ***********************************************************************************************/
			int leftTemp[] = new int[leftSize ];
			int rightTemp[] = new int[rightSize ];

		/** Populate temporary arrays  *************************************************************************************/
			 for(int i=0; i < leftSize; i++)
				leftTemp[i] = -1;

			for(int i=0; i < rightSize; i++)
				rightTemp[i] = -2;

		/** Copy data to temp arrays ***************************************************************************************/
			for(int i=0; i < leftSize; i++)
				leftTemp[i] = arr[left + i];

			for(int i=1, j=0; j < rightSize; i++, j++)
				rightTemp[j] = arr[middle + i];

	/** MERGE THE TEMP ARRAYS!!! *********************************************************************************/
		   int i=0, j=0, k=left;

			while( i < leftSize && j < rightSize ) {
				if(leftTemp[i] < rightTemp[j] ){
					arr[k] = leftTemp[i];
					i++;
				}
				else{
					arr[k] = rightTemp[j];
					j++;
				}
				k++;
			}

		/** Copy remaining elements of leftTemp, if any ******************************************************************/
			while(i < leftSize && k <= right){
				arr[k] = leftTemp[i];
				i++;
				k++;
			}
			while(j < rightSize && k <= right ){
				arr[k] = rightTemp[j];
				j++;
				k++;
			}
    }

/*****************************************************************************************************************************/
/******************************** Recursively calls sort() which in turn calls merge() **********************************/
    public static void sort(int arr[], int left, int right){
        
        if(left < right){
        /** Find middle point ***********************************************************************************************/
            int middle = (left+right)/2;

        /** Recursive call sorts first and second halves ****************************************************************/
            sort(arr, left, middle);
            sort(arr, middle + 1, right);

        /** Merge the sorted halves ***************************************************************************************/
            merge(arr, left, middle, right);
        }
    }
 }