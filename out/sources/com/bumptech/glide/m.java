package com.bumptech.glide;

import com.bumptech.glide.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private te.c<? super TranscodeType> f28850a = te.a.b();

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e15) {
            throw new RuntimeException(e15);
        }
    }

    final te.c<? super TranscodeType> c() {
        return this.f28850a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return ve.l.d(this.f28850a, ((m) obj).f28850a);
        }
        return false;
    }

    public int hashCode() {
        te.c<? super TranscodeType> cVar = this.f28850a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
