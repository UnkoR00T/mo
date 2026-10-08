package u9;

import java.util.ArrayList;
import java.util.Collections;
import l9.s;
import w7.c0;
import w7.l;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f196519a = new c0();

    private static v7.a d(c0 c0Var, int i15) {
        CharSequence charSequenceR = null;
        v7.a.b bVarP = null;
        while (i15 > 0) {
            p.e(i15 >= 8, "Incomplete vtt cue box header found.");
            int iZ = c0Var.z();
            int iZ2 = c0Var.z();
            int i16 = iZ - 8;
            String strH = o0.H(c0Var.f(), c0Var.g(), i16);
            c0Var.g0(i16);
            i15 = (i15 - 8) - i16;
            if (iZ2 == 1937011815) {
                bVarP = e.p(strH);
            } else if (iZ2 == 1885436268) {
                charSequenceR = e.r(null, strH.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return bVarP != null ? bVarP.o(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<l9.e> lVar) {
        this.f196519a.d0(bArr, i16 + i15);
        this.f196519a.f0(i15);
        ArrayList arrayList = new ArrayList();
        while (this.f196519a.a() > 0) {
            p.e(this.f196519a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZ = this.f196519a.z();
            if (this.f196519a.z() == 1987343459) {
                arrayList.add(d(this.f196519a, iZ - 8));
            } else {
                this.f196519a.g0(iZ - 8);
            }
        }
        lVar.accept(new l9.e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // l9.s
    public int c() {
        return 2;
    }
}
