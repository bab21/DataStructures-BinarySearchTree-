package com.capgemini.binarysearchtree;

public class BinarySearchTree<K extends Comparable<K>> {
	public INode<K> root;
	
	public BinarySearchTree() {
		this.root=null;
	}
	public void add(K key) {
		this.root=addRecursively(root,key);
	}
	public INode<K> addRecursively(INode<K> currentRoot,K key){
		if(currentRoot==null) {
			currentRoot=new MyBinaryNode<>(key);
			return currentRoot;
		}
		else {
			if(currentRoot.getKey().compareTo(key)>0) 
				currentRoot.setLeft(addRecursively(currentRoot.getLeft(),key));
			else if(currentRoot.getKey().compareTo(key)<0)
				currentRoot.setRight(addRecursively(currentRoot.getRight(),key));
			return currentRoot;
		}
	}
	public int getSize() {
		return getSizeRecursively(root);
	}
	public int getSizeRecursively(INode<K> currentRoot) {
		if(currentRoot==null)
			return 0;
		return 1+getSizeRecursively(currentRoot.getLeft())+getSizeRecursively(currentRoot.getRight());
	}
}
