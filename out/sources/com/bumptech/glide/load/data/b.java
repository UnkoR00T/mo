package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f28823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f28824c;

    public b(AssetManager assetManager, String str) {
        this.f28823b = assetManager;
        this.f28822a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t15 = this.f28824c;
        if (t15 == null) {
            return;
        }
        try {
            c(t15);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(T t15);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public zd.a d() {
        return zd.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f28823b, this.f28822a);
            this.f28824c = tF;
            aVar.f(tF);
        } catch (IOException e15) {
            aVar.c(e15);
        }
    }

    protected abstract T f(AssetManager assetManager, String str);
}
