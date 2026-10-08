package i8;

import l9.j;
import l9.k;
import l9.s;

/* JADX INFO: loaded from: classes3.dex */
final class b extends j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final s f89918p;

    public b(String str, s sVar) {
        super(str);
        this.f89918p = sVar;
    }

    @Override // l9.j
    protected k C(byte[] bArr, int i15, boolean z15) {
        if (z15) {
            this.f89918p.reset();
        }
        return this.f89918p.a(bArr, 0, i15);
    }
}
