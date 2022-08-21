package invertBinaryTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){          /* burada ise gelen değerin dolup olup olamdığını kontrol etmeliyiz çünkü boş değer de gelebilir */
            return null;           /* eğer gelen değer null ise yani boş ise dönülecek değer de boş olamlıdır */
        }

        TreeNode temp = root.left; /* soldaki değeri tempe atadık ve atadıktan sonra left boş şuan */
        root.left = root.right;    /* şimdi de right daki değeri boş olan left e atadık ve şuan right boş */
        root.right = temp;         /* şimdi ise temp deki leftin eski değerini right atadık ve temp boş artık */

        invertTree(root.left);     /* sol alt ağacı ve sağ alt ağacı da yapmamız gerektiği için bu işlemleri otomotik yapan metodu çağırıyoruz*/
        invertTree(root.right);

        return root;               /* return olarak da root u döneceğiz */
    }
}
