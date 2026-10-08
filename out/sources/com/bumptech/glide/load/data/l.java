package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f28846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f28847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f28848c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f28847b = contentResolver;
        this.f28846a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t15 = this.f28848c;
        if (t15 != null) {
            try {
                c(t15);
            } catch (IOException unused) {
            }
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
    public final void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f28846a, this.f28847b);
            this.f28848c = tF;
            aVar.f(tF);
        } catch (FileNotFoundException e15) {
            aVar.c(e15);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver);
}
