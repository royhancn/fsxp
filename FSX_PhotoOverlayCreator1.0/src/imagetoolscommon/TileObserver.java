// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TileObserver.java

package imagetoolscommon;


public interface TileObserver
{

    public abstract void processingTile(String s, int i, int j);

    public abstract void finishedProcessingTiles(int i);
}