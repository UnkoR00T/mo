package nd4;

import iy.a0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;
import wx.StoredMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u0011\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0\u00122\u0006\u0010\u0011\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020#0\u00122\u0006\u0010\"\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020&0\u00122\u0006\u0010\"\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b'\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.¨\u0006/"}, d2 = {"Lnd4/p;", "Lz04/a;", "Laz/f;", "fileManager", "Lez/a;", "currentTimeProvider", "Lez/e;", "dateFormatter", "Lf10/b;", "masterKeyCipher", "Laz/a;", "bytesCompressor", "Ls10/a;", "fileRegistry", "<init>", "(Laz/f;Lez/a;Lez/e;Lf10/b;Laz/a;Ls10/a;)V", "Lwx/i;", "pickedFile", "Ldx/i;", "Ldx/b;", "Lwx/l;", "g", "(Lwx/i;Ltq/e;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "Lwx/i$a;", "Lwx/k$a;", "a", "(Lwx/i$a;Ltq/e;)Ljava/lang/Object;", "Lwx/i$b;", "Lwx/k$b;", "d", "(Lwx/i$b;Ltq/e;)Ljava/lang/Object;", "name", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lwx/c;", "b", "Laz/f;", "Lez/a;", "Lez/e;", "Lf10/b;", "e", "Laz/a;", "Ls10/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements z04.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f134764h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f10.b masterKeyCipher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final az.a bytesCompressor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s10.a fileRegistry;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134775h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134776j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134777k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134778l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134779m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134780n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134781p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134782q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f134783r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f134785t;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134783r = obj;
            this.f134785t |= PKIFailureInfo.systemUnavail;
            return p.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134790h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134791j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134792k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134793l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134794m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134795n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134796p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134797q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f134798r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f134799s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f134801v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134799s = obj;
            this.f134801v |= PKIFailureInfo.systemUnavail;
            return p.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134806h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134809l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134810m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134811n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134812p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134813q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134814r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f134815s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f134817v;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134815s = obj;
            this.f134817v |= PKIFailureInfo.systemUnavail;
            return p.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134822h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134823j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134824k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134825l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134826m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134827n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f134828p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134830r;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134828p = obj;
            this.f134830r |= PKIFailureInfo.systemUnavail;
            return p.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134834g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134835h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134836j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134837k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134838l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134839m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134840n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f134841p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134843r;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134841p = obj;
            this.f134843r |= PKIFailureInfo.systemUnavail;
            return p.this.d(null, this);
        }
    }

    public p(az.f fVar, ez.a aVar, ez.e eVar, f10.b bVar, az.a aVar2, s10.a aVar3) {
        this.fileManager = fVar;
        this.currentTimeProvider = aVar;
        this.dateFormatter = eVar;
        this.masterKeyCipher = bVar;
        this.bytesCompressor = aVar2;
        this.fileRegistry = aVar3;
    }

    private final String f() {
        return "file_container_" + this.dateFormatter.d(new fz.b.LocalDateTime(this.currentTimeProvider.i()), fz.c.NO_SPACES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x0214  */
    /* JADX WARN: Code duplicated, block: B:63:0x025f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v4, types: [dx.j, java.lang.Object] */
    public final Object g(wx.i iVar, tq.e<? super dx.i<? extends dx.b, StoredMetadata>> eVar) throws Throwable {
        d dVar;
        Object objB;
        dx.j<dx.b> jVarA;
        int i15;
        String str;
        Object obj;
        ex.b bVar;
        ex.b bVar2;
        wx.i iVar2;
        int i16;
        int i17;
        int i18;
        ex.b bVar3;
        int i19;
        wx.i iVar3;
        String str2;
        ex.b bVar4;
        ex.b bVar5;
        ex.b bVar6;
        String str3;
        a0 a0Var;
        int i25;
        a0 a0Var2;
        int i26;
        int i27;
        int i28;
        dx.j<dx.b> jVar;
        Object obj2;
        s10.a aVar;
        ex.b bVar7;
        a0 a0Var3;
        int i29;
        dx.j<dx.b> jVar2;
        int i35;
        int i36;
        wx.i iVar4;
        String str4;
        ex.b bVar8;
        ex.b bVar9;
        Object obj3;
        a0 a0Var4;
        wx.i iVar5;
        Object objB2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i37 = dVar.f134817v;
            if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f134817v = i37 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object obj4 = dVar2.f134815s;
        Object objE = uq.b.e();
        ?? r15 = dVar2.f134817v;
        try {
            try {
                try {
                    if (r15 == 0) {
                        u.b(obj4);
                        jVarA = xw.c.f221622a.a();
                        ex.a aVar2 = new ex.a();
                        String strF = f();
                        az.a aVar3 = this.bytesCompressor;
                        byte[] bytes = iVar.getFileContent().getBytes();
                        dVar2.f134802d = iVar;
                        dVar2.f134803e = jVarA;
                        dVar2.f134804f = vq.j.a(aVar2);
                        dVar2.f134805g = aVar2;
                        dVar2.f134806h = strF;
                        dVar2.f134807j = aVar2;
                        i15 = 0;
                        dVar2.f134810m = 0;
                        dVar2.f134811n = 0;
                        dVar2.f134812p = 0;
                        dVar2.f134813q = 0;
                        dVar2.f134814r = 0;
                        dVar2.f134817v = 1;
                        Object objB3 = aVar3.b(bytes, dVar2);
                        if (objB3 != objE) {
                            str = strF;
                            obj = objB3;
                            bVar = aVar2;
                            bVar2 = bVar;
                            iVar2 = iVar;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar3 = bVar2;
                            i19 = 0;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        try {
                            if (r15 == 2) {
                                int i38 = dVar2.f134814r;
                                int i39 = dVar2.f134813q;
                                int i45 = dVar2.f134812p;
                                int i46 = dVar2.f134811n;
                                int i47 = dVar2.f134810m;
                                a0 a0Var5 = (a0) dVar2.f134808k;
                                ex.b bVar10 = (ex.b) dVar2.f134807j;
                                String str5 = (String) dVar2.f134806h;
                                ex.b bVar11 = (ex.b) dVar2.f134805g;
                                ex.b bVar12 = (ex.b) dVar2.f134804f;
                                jVar2 = (dx.j) dVar2.f134803e;
                                wx.i iVar6 = (wx.i) dVar2.f134802d;
                                u.b(obj4);
                                i25 = i39;
                                bVar9 = bVar10;
                                i36 = i45;
                                str4 = str5;
                                bVar8 = bVar11;
                                bVar7 = bVar12;
                                i15 = i38;
                                i35 = i46;
                                iVar4 = iVar6;
                                obj3 = obj4;
                                i29 = i47;
                                a0Var3 = a0Var5;
                                a0Var4 = (a0) bVar9.a((dx.i) obj3);
                                az.f fVar = this.fileManager;
                                byte[] data = a0Var4.getData();
                                dVar2.f134802d = iVar4;
                                dVar2.f134803e = jVar2;
                                dVar2.f134804f = vq.j.a(bVar7);
                                dVar2.f134805g = vq.j.a(bVar8);
                                dVar2.f134806h = str4;
                                dVar2.f134807j = bVar8;
                                dVar2.f134808k = vq.j.a(a0Var3);
                                dVar2.f134809l = vq.j.a(a0Var4);
                                dVar2.f134810m = i29;
                                dVar2.f134811n = i35;
                                dVar2.f134812p = i36;
                                dVar2.f134813q = i25;
                                dVar2.f134814r = i15;
                                dVar2.f134817v = 3;
                                iVar5 = iVar4;
                                bVar4 = bVar8;
                                objB2 = az.f.b(fVar, data, str4, false, dVar2, 4, null);
                                if (objB2 != objE) {
                                    a0Var2 = a0Var4;
                                    obj2 = objB2;
                                    i27 = i35;
                                    jVar = jVar2;
                                    i26 = i29;
                                    bVar6 = bVar4;
                                    bVar5 = bVar7;
                                    iVar3 = iVar5;
                                    str3 = str4;
                                    i28 = i36;
                                    a0Var = a0Var3;
                                    bVar6.a((dx.i) obj2);
                                    aVar = this.fileRegistry;
                                    dVar2.f134802d = iVar3;
                                    dVar2.f134803e = jVar;
                                    dVar2.f134804f = vq.j.a(bVar5);
                                    dVar2.f134805g = vq.j.a(bVar4);
                                    dVar2.f134806h = str3;
                                    dVar2.f134807j = vq.j.a(a0Var);
                                    dVar2.f134808k = vq.j.a(a0Var2);
                                    dVar2.f134809l = null;
                                    dVar2.f134810m = i26;
                                    dVar2.f134811n = i27;
                                    dVar2.f134812p = i28;
                                    dVar2.f134813q = i25;
                                    dVar2.f134814r = i15;
                                    dVar2.f134817v = 4;
                                    if (aVar.d(str3, dVar2) != objE) {
                                        str2 = str3;
                                    }
                                }
                                return objE;
                            }
                            if (r15 == 3) {
                                int i48 = dVar2.f134814r;
                                int i49 = dVar2.f134813q;
                                i28 = dVar2.f134812p;
                                i27 = dVar2.f134811n;
                                i26 = dVar2.f134810m;
                                a0Var2 = (a0) dVar2.f134809l;
                                a0Var = (a0) dVar2.f134808k;
                                ex.b bVar13 = (ex.b) dVar2.f134807j;
                                str3 = (String) dVar2.f134806h;
                                ex.b bVar14 = (ex.b) dVar2.f134805g;
                                bVar5 = (ex.b) dVar2.f134804f;
                                dx.j<dx.b> jVar3 = (dx.j) dVar2.f134803e;
                                wx.i iVar7 = (wx.i) dVar2.f134802d;
                                try {
                                    u.b(obj4);
                                    bVar4 = bVar14;
                                    bVar6 = bVar13;
                                    i15 = i48;
                                    jVar = jVar3;
                                    i25 = i49;
                                    iVar3 = iVar7;
                                    obj2 = obj4;
                                    bVar6.a((dx.i) obj2);
                                    aVar = this.fileRegistry;
                                    dVar2.f134802d = iVar3;
                                    dVar2.f134803e = jVar;
                                    dVar2.f134804f = vq.j.a(bVar5);
                                    dVar2.f134805g = vq.j.a(bVar4);
                                    dVar2.f134806h = str3;
                                    dVar2.f134807j = vq.j.a(a0Var);
                                    dVar2.f134808k = vq.j.a(a0Var2);
                                    dVar2.f134809l = null;
                                    dVar2.f134810m = i26;
                                    dVar2.f134811n = i27;
                                    dVar2.f134812p = i28;
                                    dVar2.f134813q = i25;
                                    dVar2.f134814r = i15;
                                    dVar2.f134817v = 4;
                                    if (aVar.d(str3, dVar2) != objE) {
                                        str2 = str3;
                                    }
                                    return objE;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r15 = jVar3;
                                    px.f fVar2 = px.f.f163100a;
                                    String message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r15));
                                    dx.i iVarA = r15.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            }
                            if (r15 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str2 = (String) dVar2.f134806h;
                            iVar3 = (wx.i) dVar2.f134802d;
                            u.b(obj4);
                        } catch (CancellationException e18) {
                            throw e18;
                        }
                    } else {
                        int i55 = dVar2.f134814r;
                        int i56 = dVar2.f134813q;
                        int i57 = dVar2.f134812p;
                        int i58 = dVar2.f134811n;
                        int i59 = dVar2.f134810m;
                        ex.b bVar15 = (ex.b) dVar2.f134807j;
                        String str6 = (String) dVar2.f134806h;
                        ex.b bVar16 = (ex.b) dVar2.f134805g;
                        ex.b bVar17 = (ex.b) dVar2.f134804f;
                        dx.j<dx.b> jVar4 = (dx.j) dVar2.f134803e;
                        iVar2 = (wx.i) dVar2.f134802d;
                        u.b(obj4);
                        i15 = i55;
                        obj = obj4;
                        bVar2 = bVar17;
                        bVar = bVar16;
                        i16 = i56;
                        jVarA = jVar4;
                        str = str6;
                        bVar3 = bVar15;
                        i19 = i59;
                        i18 = i58;
                        i17 = i57;
                    }
                    return new dx.i.Right(new StoredMetadata(str2, iVar3.getMetadata().getExtension(), iVar3.getMetadata().getSizeInBytes()));
                    a0 a0VarF = c0.f((byte[]) bVar3.a((dx.i) obj));
                    f10.b bVar18 = this.masterKeyCipher;
                    dVar2.f134802d = iVar2;
                    dVar2.f134803e = jVarA;
                    dVar2.f134804f = vq.j.a(bVar2);
                    dVar2.f134805g = bVar;
                    dVar2.f134806h = str;
                    dVar2.f134807j = bVar;
                    dVar2.f134808k = vq.j.a(a0VarF);
                    dVar2.f134810m = i19;
                    dVar2.f134811n = i18;
                    dVar2.f134812p = i17;
                    dVar2.f134813q = i16;
                    dVar2.f134814r = i15;
                    dVar2.f134817v = 2;
                    Object objB4 = bVar18.b(a0VarF, dVar2);
                    if (objB4 != objE) {
                        int i65 = i19;
                        i25 = i16;
                        iVar4 = iVar2;
                        i29 = i65;
                        i36 = i17;
                        str4 = str;
                        bVar7 = bVar2;
                        a0Var3 = a0VarF;
                        jVar2 = jVarA;
                        obj3 = objB4;
                        bVar9 = bVar;
                        bVar8 = bVar9;
                        i35 = i18;
                        a0Var4 = (a0) bVar9.a((dx.i) obj3);
                        az.f fVar3 = this.fileManager;
                        byte[] data2 = a0Var4.getData();
                        dVar2.f134802d = iVar4;
                        dVar2.f134803e = jVar2;
                        dVar2.f134804f = vq.j.a(bVar7);
                        dVar2.f134805g = vq.j.a(bVar8);
                        dVar2.f134806h = str4;
                        dVar2.f134807j = bVar8;
                        dVar2.f134808k = vq.j.a(a0Var3);
                        dVar2.f134809l = vq.j.a(a0Var4);
                        dVar2.f134810m = i29;
                        dVar2.f134811n = i35;
                        dVar2.f134812p = i36;
                        dVar2.f134813q = i25;
                        dVar2.f134814r = i15;
                        dVar2.f134817v = 3;
                        iVar5 = iVar4;
                        bVar4 = bVar8;
                        objB2 = az.f.b(fVar3, data2, str4, false, dVar2, 4, null);
                        if (objB2 != objE) {
                            a0Var2 = a0Var4;
                            obj2 = objB2;
                            i27 = i35;
                            jVar = jVar2;
                            i26 = i29;
                            bVar6 = bVar4;
                            bVar5 = bVar7;
                            iVar3 = iVar5;
                            str3 = str4;
                            i28 = i36;
                            a0Var = a0Var3;
                            bVar6.a((dx.i) obj2);
                            aVar = this.fileRegistry;
                            dVar2.f134802d = iVar3;
                            dVar2.f134803e = jVar;
                            dVar2.f134804f = vq.j.a(bVar5);
                            dVar2.f134805g = vq.j.a(bVar4);
                            dVar2.f134806h = str3;
                            dVar2.f134807j = vq.j.a(a0Var);
                            dVar2.f134808k = vq.j.a(a0Var2);
                            dVar2.f134809l = null;
                            dVar2.f134810m = i26;
                            dVar2.f134811n = i27;
                            dVar2.f134812p = i28;
                            dVar2.f134813q = i25;
                            dVar2.f134814r = i15;
                            dVar2.f134817v = 4;
                            if (aVar.d(str3, dVar2) != objE) {
                                str2 = str3;
                                return new dx.i.Right(new StoredMetadata(str2, iVar3.getMetadata().getExtension(), iVar3.getMetadata().getSizeInBytes()));
                            }
                        }
                    }
                    return objE;
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (ex.c e27) {
            e = e27;
        } catch (CancellationException e28) {
            throw e28;
        } catch (Exception e29) {
            e = e29;
            r15 = jVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [nd4.p] */
    @Override // z04.a
    public Object a(wx.i.Image image, tq.e<? super dx.i<? extends dx.b, wx.k.Image>> eVar) throws Throwable {
        e eVar2;
        Object objB;
        ex.b bVar;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f134830r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f134830r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f134828p;
        ?? E = uq.b.e();
        int i16 = eVar2.f134830r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        eVar2.f134818d = vq.j.a(image);
                        eVar2.f134819e = jVarA;
                        eVar2.f134820f = vq.j.a(aVar);
                        eVar2.f134821g = vq.j.a(aVar);
                        eVar2.f134822h = aVar;
                        eVar2.f134823j = 0;
                        eVar2.f134824k = 0;
                        eVar2.f134825l = 0;
                        eVar2.f134826m = 0;
                        eVar2.f134827n = 0;
                        eVar2.f134830r = 1;
                        Object objG = g(image, eVar2);
                        if (objG == E) {
                            return E;
                        }
                        obj = objG;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) eVar2.f134822h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(new wx.k.Image((StoredMetadata) bVar.a((dx.i) obj)));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x008e: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:28:0x008e */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0092: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:30:0x0092 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0096: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:32:0x0096 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // z04.a
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, FileContent>> eVar) throws Throwable {
        b bVar;
        Object objB;
        Object obj;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar2;
        String str2;
        a0 a0Var;
        int i19;
        dx.j<dx.b> jVarA;
        ex.b bVar3;
        ex.b bVar4;
        ex.b bVar5;
        int i25;
        int i26;
        int i27;
        ex.b bVar6;
        int i28;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i29 = bVar.f134785t;
            if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f134785t = i29 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f134783r;
        Object objE = uq.b.e();
        ?? r15 = bVar.f134785t;
        try {
            try {
                if (r15 == 0) {
                    u.b(objA);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    az.f fVar = this.fileManager;
                    az.g.File file = new az.g.File(str);
                    bVar.f134771d = vq.j.a(str);
                    bVar.f134772e = jVarA;
                    bVar.f134773f = vq.j.a(aVar);
                    bVar.f134774g = aVar;
                    bVar.f134775h = aVar;
                    i19 = 0;
                    bVar.f134778l = 0;
                    bVar.f134779m = 0;
                    bVar.f134780n = 0;
                    bVar.f134781p = 0;
                    bVar.f134782q = 0;
                    bVar.f134785t = 1;
                    objA = fVar.l(file, bVar);
                    if (objA != objE) {
                        str2 = str;
                        i25 = 0;
                        i26 = 0;
                        i27 = 0;
                        bVar6 = aVar;
                        bVar4 = bVar6;
                        bVar3 = bVar4;
                        i28 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        try {
                            if (r15 == 2) {
                                int i35 = bVar.f134782q;
                                i15 = bVar.f134781p;
                                i16 = bVar.f134780n;
                                i17 = bVar.f134779m;
                                i18 = bVar.f134778l;
                                a0 a0Var2 = (a0) bVar.f134776j;
                                bVar2 = (ex.b) bVar.f134775h;
                                ex.b bVar7 = (ex.b) bVar.f134774g;
                                ex.b bVar8 = (ex.b) bVar.f134773f;
                                dx.j<dx.b> jVar = (dx.j) bVar.f134772e;
                                str2 = (String) bVar.f134771d;
                                u.b(objA);
                                a0Var = a0Var2;
                                i19 = i35;
                                jVarA = jVar;
                                bVar3 = bVar8;
                                bVar4 = bVar7;
                                a0 a0Var3 = (a0) bVar2.a((dx.i) objA);
                                az.a aVar2 = this.bytesCompressor;
                                byte[] data = a0Var3.getData();
                                bVar.f134771d = vq.j.a(str2);
                                bVar.f134772e = jVarA;
                                bVar.f134773f = vq.j.a(bVar3);
                                bVar.f134774g = vq.j.a(bVar4);
                                bVar.f134775h = bVar4;
                                bVar.f134776j = vq.j.a(a0Var);
                                bVar.f134777k = vq.j.a(a0Var3);
                                bVar.f134778l = i18;
                                bVar.f134779m = i17;
                                bVar.f134780n = i16;
                                bVar.f134781p = i15;
                                bVar.f134782q = i19;
                                bVar.f134785t = 3;
                                objA = aVar2.a(data, bVar);
                                if (objA != objE) {
                                    bVar5 = bVar4;
                                }
                                return objE;
                            }
                            if (r15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar5 = (ex.b) bVar.f134775h;
                            u.b(objA);
                        } catch (CancellationException e15) {
                            throw e15;
                        }
                    } else {
                        int i36 = bVar.f134782q;
                        i25 = bVar.f134781p;
                        i26 = bVar.f134780n;
                        i27 = bVar.f134779m;
                        int i37 = bVar.f134778l;
                        ex.b bVar9 = (ex.b) bVar.f134775h;
                        ex.b bVar10 = (ex.b) bVar.f134774g;
                        ex.b bVar11 = (ex.b) bVar.f134773f;
                        dx.j<dx.b> jVar2 = (dx.j) bVar.f134772e;
                        str2 = (String) bVar.f134771d;
                        u.b(objA);
                        i19 = i36;
                        jVarA = jVar2;
                        bVar3 = bVar11;
                        bVar4 = bVar10;
                        bVar6 = bVar9;
                        i28 = i37;
                    }
                    return new dx.i.Right(new FileContent((byte[]) bVar5.a((dx.i) objA)));
                } catch (ex.c e16) {
                    e = e16;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e17) {
                    throw e17;
                } catch (Exception e18) {
                    e = e18;
                    r15 = obj;
                    px.f fVar2 = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(r15));
                    dx.i iVarA = r15.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
                a0 a0VarF = c0.f((byte[]) bVar6.a((dx.i) objA));
                f10.b bVar12 = this.masterKeyCipher;
                bVar.f134771d = vq.j.a(str2);
                bVar.f134772e = jVarA;
                bVar.f134773f = vq.j.a(bVar3);
                bVar.f134774g = bVar4;
                bVar.f134775h = bVar4;
                bVar.f134776j = vq.j.a(a0VarF);
                bVar.f134778l = i28;
                bVar.f134779m = i27;
                bVar.f134780n = i26;
                bVar.f134781p = i25;
                bVar.f134782q = i19;
                bVar.f134785t = 2;
                Object objA2 = bVar12.a(a0VarF, bVar);
                if (objA2 != objE) {
                    a0Var = a0VarF;
                    objA = objA2;
                    i15 = i25;
                    i16 = i26;
                    i17 = i27;
                    i18 = i28;
                    bVar2 = bVar4;
                    a0 a0Var4 = (a0) bVar2.a((dx.i) objA);
                    az.a aVar3 = this.bytesCompressor;
                    byte[] data2 = a0Var4.getData();
                    bVar.f134771d = vq.j.a(str2);
                    bVar.f134772e = jVarA;
                    bVar.f134773f = vq.j.a(bVar3);
                    bVar.f134774g = vq.j.a(bVar4);
                    bVar.f134775h = bVar4;
                    bVar.f134776j = vq.j.a(a0Var);
                    bVar.f134777k = vq.j.a(a0Var4);
                    bVar.f134778l = i18;
                    bVar.f134779m = i17;
                    bVar.f134780n = i16;
                    bVar.f134781p = i15;
                    bVar.f134782q = i19;
                    bVar.f134785t = 3;
                    objA = aVar3.a(data2, bVar);
                    if (objA != objE) {
                        bVar5 = bVar4;
                        return new dx.i.Right(new FileContent((byte[]) bVar5.a((dx.i) objA)));
                    }
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011a A[Catch: Exception -> 0x0168, c -> 0x016c, CancellationException -> 0x016f, TRY_LEAVE, TryCatch #10 {c -> 0x016c, CancellationException -> 0x016f, Exception -> 0x0168, blocks: (B:47:0x010c, B:49:0x011a), top: B:96:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x014e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0172  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // z04.a
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        Object objJ;
        az.g.File file;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        dx.j<dx.b> jVar;
        int i19;
        boolean zBooleanValue;
        ex.b bVar3;
        dx.j<dx.b> jVar2;
        Object objE;
        int i25;
        az.g.File file2;
        ex.b bVar4;
        String str2;
        int i26;
        int i27;
        int i28;
        int i29;
        ex.b bVar5;
        s10.a aVar2;
        String str3 = str;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i35 = cVar.f134801v;
            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f134801v = i35 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f134799s;
        ?? E = uq.b.e();
        int i36 = cVar.f134801v;
        try {
            try {
                if (i36 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        az.g.File file3 = new az.g.File(str3);
                        az.f fVar = this.fileManager;
                        cVar.f134786d = str3;
                        cVar.f134787e = jVarA;
                        cVar.f134788f = vq.j.a(aVar);
                        cVar.f134789g = aVar;
                        cVar.f134790h = file3;
                        cVar.f134791j = aVar;
                        cVar.f134792k = 0;
                        cVar.f134793l = 0;
                        cVar.f134794m = 0;
                        cVar.f134795n = 0;
                        cVar.f134796p = 0;
                        cVar.f134801v = 1;
                        objJ = fVar.j(file3, cVar);
                        if (objJ != E) {
                            file = file3;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar = aVar;
                            bVar2 = bVar;
                            jVar = jVarA;
                            i19 = 0;
                            zBooleanValue = ((Boolean) aVar.a((dx.i) objJ)).booleanValue();
                            if (zBooleanValue) {
                                az.f fVar2 = this.fileManager;
                                cVar.f134786d = str3;
                                cVar.f134787e = jVar;
                                cVar.f134788f = vq.j.a(bVar2);
                                cVar.f134789g = vq.j.a(bVar);
                                cVar.f134790h = vq.j.a(file);
                                cVar.f134791j = bVar;
                                cVar.f134792k = i18;
                                cVar.f134793l = i17;
                                cVar.f134794m = i16;
                                cVar.f134795n = i15;
                                cVar.f134796p = i19;
                                cVar.f134798r = zBooleanValue;
                                cVar.f134797q = 0;
                                cVar.f134801v = 2;
                                objE = fVar2.e(file, cVar);
                                if (objE != E) {
                                    i25 = i18;
                                    file2 = file;
                                    bVar3 = bVar;
                                    bVar4 = bVar2;
                                    str2 = str3;
                                    i26 = i19;
                                    jVar2 = jVar;
                                    obj = objE;
                                    i27 = i15;
                                    i28 = i16;
                                    i29 = i17;
                                    bVar5 = bVar3;
                                    bVar5.a((dx.i) obj);
                                    i19 = i26;
                                    i17 = i29;
                                    str3 = str2;
                                    i16 = i28;
                                    bVar2 = bVar4;
                                    i15 = i27;
                                    file = file2;
                                    i18 = i25;
                                    aVar2 = this.fileRegistry;
                                    cVar.f134786d = vq.j.a(str3);
                                    cVar.f134787e = jVar2;
                                    cVar.f134788f = vq.j.a(bVar2);
                                    cVar.f134789g = vq.j.a(bVar3);
                                    cVar.f134790h = vq.j.a(file);
                                    cVar.f134791j = null;
                                    cVar.f134792k = i18;
                                    cVar.f134793l = i17;
                                    cVar.f134794m = i16;
                                    cVar.f134795n = i15;
                                    cVar.f134796p = i19;
                                    cVar.f134801v = 3;
                                    if (aVar2.a(str3, cVar) != E) {
                                        return new dx.i.Right(i0.f148189a);
                                    }
                                }
                            } else {
                                bVar3 = bVar;
                                jVar2 = jVar;
                                aVar2 = this.fileRegistry;
                                cVar.f134786d = vq.j.a(str3);
                                cVar.f134787e = jVar2;
                                cVar.f134788f = vq.j.a(bVar2);
                                cVar.f134789g = vq.j.a(bVar3);
                                cVar.f134790h = vq.j.a(file);
                                cVar.f134791j = null;
                                cVar.f134792k = i18;
                                cVar.f134793l = i17;
                                cVar.f134794m = i16;
                                cVar.f134795n = i15;
                                cVar.f134796p = i19;
                                cVar.f134801v = 3;
                                if (aVar2.a(str3, cVar) != E) {
                                    return new dx.i.Right(i0.f148189a);
                                }
                            }
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar3.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i36 != 1) {
                    if (i36 != 2) {
                        if (i36 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            u.b(obj);
                            return new dx.i.Right(i0.f148189a);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    i26 = cVar.f134796p;
                    i27 = cVar.f134795n;
                    i28 = cVar.f134794m;
                    i29 = cVar.f134793l;
                    i25 = cVar.f134792k;
                    bVar5 = (ex.b) cVar.f134791j;
                    file2 = (az.g.File) cVar.f134790h;
                    bVar3 = (ex.b) cVar.f134789g;
                    bVar4 = (ex.b) cVar.f134788f;
                    jVar2 = (dx.j) cVar.f134787e;
                    str2 = (String) cVar.f134786d;
                    try {
                        u.b(obj);
                        bVar5.a((dx.i) obj);
                        i19 = i26;
                        i17 = i29;
                        str3 = str2;
                        i16 = i28;
                        bVar2 = bVar4;
                        i15 = i27;
                        file = file2;
                        i18 = i25;
                        aVar2 = this.fileRegistry;
                        cVar.f134786d = vq.j.a(str3);
                        cVar.f134787e = jVar2;
                        cVar.f134788f = vq.j.a(bVar2);
                        cVar.f134789g = vq.j.a(bVar3);
                        cVar.f134790h = vq.j.a(file);
                        cVar.f134791j = null;
                        cVar.f134792k = i18;
                        cVar.f134793l = i17;
                        cVar.f134794m = i16;
                        cVar.f134795n = i15;
                        cVar.f134796p = i19;
                        cVar.f134801v = 3;
                        if (aVar2.a(str3, cVar) != E) {
                            return new dx.i.Right(i0.f148189a);
                        }
                        return E;
                    } catch (ex.c e25) {
                        e = e25;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e26) {
                        throw e26;
                    } catch (Exception e27) {
                        e = e27;
                        E = jVar2;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                int i37 = cVar.f134796p;
                int i38 = cVar.f134795n;
                i16 = cVar.f134794m;
                i17 = cVar.f134793l;
                i18 = cVar.f134792k;
                aVar = (ex.b) cVar.f134791j;
                file = (az.g.File) cVar.f134790h;
                bVar = (ex.b) cVar.f134789g;
                bVar2 = (ex.b) cVar.f134788f;
                dx.j<dx.b> jVar3 = (dx.j) cVar.f134787e;
                String str4 = (String) cVar.f134786d;
                try {
                    u.b(obj);
                    i19 = i37;
                    str3 = str4;
                    i15 = i38;
                    jVar = jVar3;
                    objJ = obj;
                    try {
                        zBooleanValue = ((Boolean) aVar.a((dx.i) objJ)).booleanValue();
                        if (zBooleanValue) {
                            az.f fVar5 = this.fileManager;
                            cVar.f134786d = str3;
                            cVar.f134787e = jVar;
                            cVar.f134788f = vq.j.a(bVar2);
                            cVar.f134789g = vq.j.a(bVar);
                            cVar.f134790h = vq.j.a(file);
                            cVar.f134791j = bVar;
                            cVar.f134792k = i18;
                            cVar.f134793l = i17;
                            cVar.f134794m = i16;
                            cVar.f134795n = i15;
                            cVar.f134796p = i19;
                            cVar.f134798r = zBooleanValue;
                            cVar.f134797q = 0;
                            cVar.f134801v = 2;
                            objE = fVar5.e(file, cVar);
                            if (objE != E) {
                                i25 = i18;
                                file2 = file;
                                bVar3 = bVar;
                                bVar4 = bVar2;
                                str2 = str3;
                                i26 = i19;
                                jVar2 = jVar;
                                obj = objE;
                                i27 = i15;
                                i28 = i16;
                                i29 = i17;
                                bVar5 = bVar3;
                                bVar5.a((dx.i) obj);
                                i19 = i26;
                                i17 = i29;
                                str3 = str2;
                                i16 = i28;
                                bVar2 = bVar4;
                                i15 = i27;
                                file = file2;
                                i18 = i25;
                                aVar2 = this.fileRegistry;
                                cVar.f134786d = vq.j.a(str3);
                                cVar.f134787e = jVar2;
                                cVar.f134788f = vq.j.a(bVar2);
                                cVar.f134789g = vq.j.a(bVar3);
                                cVar.f134790h = vq.j.a(file);
                                cVar.f134791j = null;
                                cVar.f134792k = i18;
                                cVar.f134793l = i17;
                                cVar.f134794m = i16;
                                cVar.f134795n = i15;
                                cVar.f134796p = i19;
                                cVar.f134801v = 3;
                                if (aVar2.a(str3, cVar) != E) {
                                    return new dx.i.Right(i0.f148189a);
                                }
                            }
                        } else {
                            bVar3 = bVar;
                            jVar2 = jVar;
                            aVar2 = this.fileRegistry;
                            cVar.f134786d = vq.j.a(str3);
                            cVar.f134787e = jVar2;
                            cVar.f134788f = vq.j.a(bVar2);
                            cVar.f134789g = vq.j.a(bVar3);
                            cVar.f134790h = vq.j.a(file);
                            cVar.f134791j = null;
                            cVar.f134792k = i18;
                            cVar.f134793l = i17;
                            cVar.f134794m = i16;
                            cVar.f134795n = i15;
                            cVar.f134796p = i19;
                            cVar.f134801v = 3;
                            if (aVar2.a(str3, cVar) != E) {
                                return new dx.i.Right(i0.f148189a);
                            }
                        }
                        return E;
                    } catch (ex.c e28) {
                        e = e28;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e29) {
                        throw e29;
                    } catch (Exception e35) {
                        e = e35;
                        E = jVar;
                        px.f fVar6 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar6.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (ex.c e36) {
                    e = e36;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e37) {
                    throw e37;
                } catch (Exception e38) {
                    e = e38;
                    E = jVar3;
                    px.f fVar7 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar7.d(message, e, px.c.a(E));
                    iVarA = E.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (Exception e39) {
                e = e39;
            }
        } catch (CancellationException e45) {
            throw e45;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [nd4.p] */
    @Override // z04.a
    public Object d(wx.i.Regular regular, tq.e<? super dx.i<? extends dx.b, wx.k.Regular>> eVar) throws Throwable {
        f fVar;
        Object objB;
        ex.b bVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f134843r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f134843r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f134841p;
        ?? E = uq.b.e();
        int i16 = fVar.f134843r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        fVar.f134831d = vq.j.a(regular);
                        fVar.f134832e = jVarA;
                        fVar.f134833f = vq.j.a(aVar);
                        fVar.f134834g = vq.j.a(aVar);
                        fVar.f134835h = aVar;
                        fVar.f134836j = 0;
                        fVar.f134837k = 0;
                        fVar.f134838l = 0;
                        fVar.f134839m = 0;
                        fVar.f134840n = 0;
                        fVar.f134843r = 1;
                        Object objG = g(regular, fVar);
                        if (objG == E) {
                            return E;
                        }
                        obj = objG;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) fVar.f134835h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(new wx.k.Regular((StoredMetadata) bVar.a((dx.i) obj)));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
