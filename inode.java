package com.capgemini.binarysearchtree;

public interface INode<K> {
	public void setKey(K key);
	public K getKey();
	
	public void setLeft(INode left);
	public void setRight(INode right);
	
	public INode getLeft();
	public INode getRight();
	
}
