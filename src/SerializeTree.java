public class SerializeTree {

    private StringBuilder output = new StringBuilder();
    int position = -1;

    public static void main(String args[]) {
        SerializeTree obj = new SerializeTree();

        SerializableNode root = obj.constructTree();
        obj.serializeNode(root);
        System.out.println(obj.output);
        SerializableNode result = obj.deSerializeNode(obj.output.toString());
        System.out.println(result);
        System.out.println(result.left.data);
        System.out.println(result.left.left.data);
        System.out.println(result.left.right.data);
        System.out.println(result.left.left.data);
        System.out.println(result.right.data);
    }

    private SerializableNode constructTree() {
        SerializableNode root = new SerializableNode();
        root.data = 5;
        root.left = new SerializableNode();
        root.right = new SerializableNode();
        root.left.data = 4;
        root.right.data = 10;
        root.left.left = new SerializableNode();
        root.left.left.data = 6;
        return root;
    }

    private void serializeNode(SerializableNode root) {
        if (root == null) {
            output.append("null");
            output.append(",");
            return;
        }
        output.append(root.data);
        output.append(",");
        serializeNode(root.left);
        serializeNode(root.right);
    }

    private SerializableNode deSerializeNode(String serialized) {
        String nodes[] = serialized.split(",");
        return makeTree(nodes);
    }

    private SerializableNode makeTree(String[] data) {
        ++position;
        if (position > data.length) {
            if (data[position] == "null") {
                return new SerializableNode();
            }
            SerializableNode node = new SerializableNode();
            node.data = Integer.parseInt(data[position]);
            node.left = makeTree(data);
            node.right = makeTree(data);

            return node;
        } else {
            return new SerializableNode();
        }
    }

    class SerializableNode {
        int data;
        SerializableNode left;
        SerializableNode right;

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }
}

