package me;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements yd.a.InterfaceC6070a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.d f125905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.b f125906b;

    public b(ce.d dVar, ce.b bVar) {
        this.f125905a = dVar;
        this.f125906b = bVar;
    }

    @Override // yd.a.InterfaceC6070a
    public void a(Bitmap bitmap) {
        this.f125905a.c(bitmap);
    }

    @Override // yd.a.InterfaceC6070a
    public byte[] b(int i15) {
        ce.b bVar = this.f125906b;
        return bVar == null ? new byte[i15] : (byte[]) bVar.c(i15, byte[].class);
    }

    @Override // yd.a.InterfaceC6070a
    public Bitmap c(int i15, int i16, Bitmap.Config config) {
        return this.f125905a.e(i15, i16, config);
    }

    @Override // yd.a.InterfaceC6070a
    public int[] d(int i15) {
        ce.b bVar = this.f125906b;
        return bVar == null ? new int[i15] : (int[]) bVar.c(i15, int[].class);
    }

    @Override // yd.a.InterfaceC6070a
    public void e(byte[] bArr) {
        ce.b bVar = this.f125906b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // yd.a.InterfaceC6070a
    public void f(int[] iArr) {
        ce.b bVar = this.f125906b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
