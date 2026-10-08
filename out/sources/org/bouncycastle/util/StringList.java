package org.bouncycastle.util;

/* JADX INFO: loaded from: classes5.dex */
public interface StringList extends Iterable<String> {
    boolean add(String str);

    String get(int i15);

    int size();

    String[] toStringArray();

    String[] toStringArray(int i15, int i16);
}
