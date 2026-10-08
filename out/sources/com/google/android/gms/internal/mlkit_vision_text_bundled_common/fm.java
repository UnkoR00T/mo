package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class fm extends cm {
    public fm() {
        super(4);
    }

    public final fm a(Object obj) {
        int i15 = this.f30379b;
        int i16 = i15 + 1;
        Object[] objArr = this.f30378a;
        int length = objArr.length;
        if (length < i16) {
            int i17 = length + (length >> 1) + 1;
            if (i17 < i16) {
                int iHighestOneBit = Integer.highestOneBit(i15);
                i17 = iHighestOneBit + iHighestOneBit;
            }
            if (i17 < 0) {
                i17 = Integer.MAX_VALUE;
            }
            this.f30378a = Arrays.copyOf(objArr, i17);
            this.f30380c = false;
        } else if (this.f30380c) {
            this.f30378a = (Object[]) objArr.clone();
            this.f30380c = false;
        }
        Object[] objArr2 = this.f30378a;
        int i18 = this.f30379b;
        this.f30379b = i18 + 1;
        objArr2[i18] = obj;
        return this;
    }

    public final im b() {
        this.f30380c = true;
        return im.j(this.f30378a, this.f30379b);
    }
}
