public class TopView {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new NodeNew(50);
        tree.root.left = new NodeNew(20);
        tree.root.right = new NodeNew(70);
        tree.root.left.left = new NodeNew(10);
        tree.root.left.right = new NodeNew(30);
        tree.root.right.left = new NodeNew(60);
        tree.root.right.right = new NodeNew(80);
        tree.root.right.left.right = new NodeNew(65);
        System.out.println("Top view of the binary tree is:");
        tree.topView(tree.root);
    }
}
