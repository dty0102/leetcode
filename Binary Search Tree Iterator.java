Solution: to find the left child for every node and then add it to the stack, if the left child is null and the node has used , then push the right child into the stack
public class BSTIterator {

        private TreeNode current; 
        private Stack<TreeNode> stack;
        public BSTIterator(TreeNode root) {
            current = root;
            stack = new Stack<TreeNode>();
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !stack.isEmpty() || current!=null;
        }

        /** @return the next smallest number */
        public int next() {
            while (!stack.isEmpty() || current!=null) {
                if (current!=null) {
                    stack.push(current);
                    current = current.left;
                } else {
                    current = stack.peek().right;
                    break;
                }
            }
            TreeNode node = stack.pop();
            return node.val;
        }
    }
