package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.b10;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.ef;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.ht;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.i8;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.jw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.k7;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.kx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.lv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.mj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.nd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.qk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.rr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.s5;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.sf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.sh;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.tb;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.vu;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.x10;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.xo;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.yd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.yj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.yv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zk;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 extends yv implements kx {
    private static final c2 zbd;
    private b10 zbA;
    private zk zbC;
    private yj zbD;
    private m4 zbE;
    private x10 zbF;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.o0 zbG;
    private vu zbH;
    private xo zbJ;
    private rr zbK;
    private k7 zbL;
    private k7 zbM;
    private k7 zbN;
    private int zbe;
    private int zbf;
    private long zbg;
    private sh zbh;
    private zk zbi;
    private yj zbj;
    private mj zbk;
    private int zbl;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.s1 zbm;
    private ht zbn;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.k2 zbo;
    private qk zbp;
    private sf zbq;
    private yd zbr;
    private nd zbs;
    private i8 zbt;
    private x2 zbu;
    private boolean zbv;
    private tb zbw;
    private s5 zbx;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.w3 zby;
    private n0 zbz;
    private byte zbO = 2;
    private jw zbB = bw.C();
    private String zbI = "";

    static {
        c2 c2Var = new c2();
        zbd = c2Var;
        bw.l(c2.class, c2Var);
    }

    private c2() {
    }

    public static c2 G() {
        return zbd;
    }

    public static c2 H(byte[] bArr, lv lvVar) {
        return (c2) bw.y(zbd, bArr, lvVar);
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.o0 I() {
        com.google.android.gms.internal.mlkit_vision_text_bundled_common.o0 o0Var = this.zbG;
        return o0Var == null ? com.google.android.gms.internal.mlkit_vision_text_bundled_common.o0.G() : o0Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.bw
    protected final Object p(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zbO);
        }
        if (i16 == 2) {
            return bw.f(zbd, "\u0001\"\u0000\u0002\u0001'\"\u0000\u0001\t\u0001ဂ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nဉ\t\u000bᐉ\n\fဉ\u000e\rဉ\u000b\u000eဉ\r\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဉ\f\u0013ᐉ\u0011\u0014ဉ\u0012\u0015ᐉ\u0013\u0016ဉ\u0014\u0018\u001b\u0019ဉ\u0017\u001aဉ\u0018\u001bᐉ\u0015\u001eဉ\u0016\u001fᐉ\u0019!ဉ\u001a\"ဈ\u001b#ဉ\u001c$ဉ\u001d%ဉ\u001e&ဉ\u001f'ဉ ", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", ef.a(), "zbm", "zbn", "zbo", "zbp", "zbq", "zbu", "zbr", "zbt", "zbv", "zbw", "zbs", "zbx", "zby", "zbz", "zbA", "zbB", k2.class, "zbE", "zbF", "zbC", "zbD", "zbG", "zbH", "zbI", "zbJ", "zbK", "zbL", "zbM", "zbN"});
        }
        if (i16 == 3) {
            return new c2();
        }
        a2 a2Var = null;
        if (i16 == 4) {
            return new b2(a2Var);
        }
        if (i16 == 5) {
            return zbd;
        }
        this.zbO = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
