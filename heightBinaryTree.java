class BinaryTree
{
  public static int height(Node root)
  {
     if(root == null)
     {
        return 0;
     }
     int l=height(root.left);
     int r=height(root.right);

     int h=Math.max(l,r);
     return h+1;
  }
}
