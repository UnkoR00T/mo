package tz;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltz/a;", "", "<init>", "()V", "T", "Lsx/b$a;", "mode", "Ltz/b;", "a", "(Lsx/b$a;)Ltz/b;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final <T> b<T> a(sx.b.Analyzer mode) {
        sx.e scannerType = mode.getScannerType();
        if (scannerType instanceof sx.e.SingleQrScanner) {
            return new u(((sx.e.SingleQrScanner) scannerType).getFormat());
        }
        if (scannerType instanceof sx.e.QrScanner) {
            return new g(((sx.e.QrScanner) scannerType).getFormat());
        }
        if (scannerType instanceof sx.e.c) {
            return new p();
        }
        if (fr.t.c(scannerType, sx.e.b.f185177a)) {
            return new l();
        }
        throw new oq.p();
    }
}
