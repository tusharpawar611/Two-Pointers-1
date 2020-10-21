// class Solution {

//     public int maxArea(int[] height) {
            
//             if (height == null || height.length == 0)
//                 return 0;

//             int maxVol = 0;    
//             int hi = 0,wid = 0;
//             for(int i=0;i<height.length;i++){
//                 for(int d=i+1;d<height.length;d++){
//                     if(height[i]>height[d]){
//                         hi = height[d];
//                     }
//                     else{
//                         hi = height[i];
//                     }
//                     wid = d-i;
//                     if(maxVol<hi*wid){
//                         maxVol=hi*wid;
//                     }
//                 }
//             }

//             return maxVol;

          
// }
// }
class Solution {

    public int maxArea(int[] height) {
        int l=0,r=height.length-1,area = 0;
        while(l<r){
            area = Math.max(area, (r - l) * Math.min(height[r], height[l]));
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
          
          return area;
}
}