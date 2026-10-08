package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class bf0 implements o60 {
    bf0() {
    }

    @Override // com.google.android.libraries.places.internal.z70
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, p60.f33274a)));
        }
        return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
    }

    @Override // com.google.android.libraries.places.internal.z70
    public final /* synthetic */ byte[] b(Object obj) {
        throw new UnsupportedOperationException();
    }
}
