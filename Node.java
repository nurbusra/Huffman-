package huffman;

class Node {
	char nodechar;
	static int size;
	int frequency;
	StringBuffer code;
	Node left,right;
	Node(char ch,int fr){
		nodechar=ch;
		frequency=fr;
		size++;
		left=right=null;
	}
	Node(char ch,int fr,Node left,Node right){
		nodechar=ch;
		frequency=fr;
		size++;
		this.left=left;
		this.right=right;
	}
}