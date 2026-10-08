package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes4.dex */
final class sp implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f33713a = new sp();

    private sp() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 99) {
            switch (i15) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BERTags.DATE /* 31 */:
                case 32:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
