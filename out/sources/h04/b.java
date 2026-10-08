package h04;

import ay.j;
import e04.BiometricData;
import er.l;
import er.p;
import fr.q0;
import iy.a0;
import iy.b0;
import iy.c0;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.i;
import ju.l0;
import ju.p0;
import mr.r;
import oq.i0;
import oq.k;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.biometric.data.model.BiometricsDataDto;
import pl.gov.coi.mobywatel.technical.biometric.data.model.BiometricsInAppAuthStatusDto;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lh04/b;", "Lf04/a;", "Lcz/c;", "persistentStorageFactory", "Lay/j;", "jsonSerializer", "Ld00/a;", "inMemoryCache", "Liy/a;", "base64Coder", "<init>", "(Lcz/c;Lay/j;Ld00/a;Liy/a;)V", "", "jsonBiometricData", "Le04/c;", "s0", "(Ljava/lang/String;)Le04/c;", "t0", "biometricData", "", ip.a.f96137b, "(Le04/c;Ltq/e;)Ljava/lang/Object;", "W", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "hashedPin", "Ldx/i;", "Ldx/b;", "Loq/i0;", "M", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "e", "clear", "()V", "a", "Lay/j;", "b", "Ld00/a;", "c", "Liy/a;", "Lcz/b;", "d", "Loq/k;", "r0", "()Lcz/b;", "persistentStorage", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f04.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f79214f = cz.b.a.b("shared_prefs_biometrics_data");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f79215g = cz.b.a.b("shared_prefs_hashed_pin");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d00.a inMemoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k persistentStorage;

    /* JADX INFO: renamed from: h04.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le04/c;", "<anonymous>", "()Le04/c;"}, k = 3, mv = {2, 2, 0})
    static final class C1807b extends vq.k implements l<tq.e<? super BiometricData>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79220e;

        /* JADX INFO: renamed from: h04.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Le04/c;", "<anonymous>", "(Lju/p0;)Le04/c;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<p0, tq.e<? super BiometricData>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f79222e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f79223f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f79223f = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f79222e;
                if (i15 == 0) {
                    u.b(obj);
                    cz.b bVarR0 = this.f79223f.r0();
                    String str = b.f79214f;
                    this.f79222e = 1;
                    obj = bVarR0.j(str, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = "";
                }
                return str2.length() == 0 ? new BiometricData(new e04.e.a.App(false, 1, null), a0.INSTANCE.a()) : this.f79223f.s0(str2);
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super BiometricData> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f79223f, eVar);
            }
        }

        C1807b(tq.e<? super C1807b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79220e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            l0 l0VarB = g1.b();
            a aVar = new a(b.this, null);
            this.f79220e = 1;
            Object objG = i.g(l0VarB, aVar, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C1807b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super BiometricData> eVar) {
            return ((C1807b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f79224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f79226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f79227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f79228h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f79229j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f79230k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f79231l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f79232m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f79234p;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f79232m = obj;
            this.f79234p |= PKIFailureInfo.systemUnavail;
            return b.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f79235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f79236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f79237f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f79239h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f79237f = obj;
            this.f79239h |= PKIFailureInfo.systemUnavail;
            return b.this.S(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79240e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BiometricData f79242g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(BiometricData biometricData, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f79242g = biometricData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79240e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            cz.b bVarR0 = b.this.r0();
            String str = b.f79214f;
            String strB = b.this.jsonSerializer.b(i04.a.f87819a.c(this.f79242g, b.this.base64Coder), q0.n(BiometricsDataDto.class));
            this.f79240e = 1;
            Object objE2 = bVarR0.e(str, strB, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new e(this.f79242g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f79243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f79244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f79245f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f79246g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f79247h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f79248j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f79249k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f79250l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f79251m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f79252n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f79254q;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f79252n = obj;
            this.f79254q |= PKIFailureInfo.systemUnavail;
            return b.this.M(null, this);
        }
    }

    public b(final cz.c cVar, j jVar, d00.a aVar, iy.a aVar2) {
        this.jsonSerializer = jVar;
        this.inMemoryCache = aVar;
        this.base64Coder = aVar2;
        this.persistentStorage = oq.l.a(new er.a() { // from class: h04.a
            @Override // er.a
            public final Object a() {
                return b.u0(cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cz.b r0() {
        return (cz.b) this.persistentStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BiometricData s0(String jsonBiometricData) {
        Object objB;
        dx.i left;
        Object objB2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    left = new dx.i.Right((BiometricData) new ex.a().a(i04.a.f87819a.a((BiometricsDataDto) this.jsonSerializer.a(jsonBiometricData, q0.n(BiometricsDataDto.class)), this.base64Coder)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            left = new dx.i.Left(objB);
        }
        if (left instanceof dx.i.Left) {
            objB2 = t0(jsonBiometricData);
        } else {
            if (!(left instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB2 = ((dx.i.Right) left).b();
        }
        return (BiometricData) objB2;
    }

    private final BiometricData t0(String jsonBiometricData) {
        Object objB;
        dx.i left;
        Object objB2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    j jVar = this.jsonSerializer;
                    r.Companion companion = r.INSTANCE;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) jVar.a(jsonBiometricData, q0.p(LinkedHashMap.class, companion.d(q0.n(String.class)), companion.d(q0.n(String.class))));
                    left = new dx.i.Right(new BiometricData(i04.a.f87819a.b(BiometricsInAppAuthStatusDto.valueOf((String) v.k0(linkedHashMap.values()))), c0.f((byte[]) aVar.a(iy.a.c(this.base64Coder, (String) v.w0(linkedHashMap.values()), null, 2, null)))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            left = new dx.i.Left(objB);
        }
        if (left instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) left).b();
            px.f.e(px.f.f163100a, "Corrupted BiometricData: " + jsonBiometricData + ", error: " + bVar, null, px.c.a(this), 2, null);
            objB2 = new BiometricData(new e04.e.a.App(true), a0.INSTANCE.a());
        } else {
            if (!(left instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB2 = ((dx.i.Right) left).b();
        }
        return (BiometricData) objB2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b u0(cz.c cVar) {
        return cVar.a("shared_prefs_biometrics", cz.d.PLAIN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [iy.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // f04.a
    public Object M(b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        f fVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f79254q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f79254q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f79252n;
        Object objE = uq.b.e();
        int i16 = fVar.f79254q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        cz.b bVarR0 = r0();
                        String str = f79215g;
                        String strE = c0.e(b0Var);
                        fVar.f79243d = vq.j.a(b0Var);
                        fVar.f79244e = jVarA;
                        fVar.f79245f = vq.j.a(aVar);
                        fVar.f79246g = vq.j.a(aVar);
                        fVar.f79247h = 0;
                        fVar.f79248j = 0;
                        fVar.f79249k = 0;
                        fVar.f79250l = 0;
                        fVar.f79251m = 0;
                        fVar.f79254q = 1;
                        if (bVarR0.e(str, strE, fVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        b0Var = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(b0Var));
                        dx.i iVarA = b0Var.a(e);
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
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f04.a
    public Object S(BiometricData biometricData, tq.e<? super Boolean> eVar) throws Throwable {
        d dVar;
        boolean z15;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f79239h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f79239h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objG = dVar.f79237f;
        Object objE = uq.b.e();
        int i16 = dVar.f79239h;
        if (i16 != 0) {
            if (i16 == 1) {
                biometricData = (BiometricData) dVar.f79235d;
                u.b(objG);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z15 = dVar.f79236e;
                u.b(objG);
            }
            return vq.b.a(z15);
        }
        u.b(objG);
        this.inMemoryCache.n(556);
        l0 l0VarB = g1.b();
        e eVar2 = new e(biometricData, null);
        dVar.f79235d = vq.j.a(biometricData);
        dVar.f79239h = 1;
        objG = i.g(l0VarB, eVar2, dVar);
        if (objG != objE) {
        }
        return objE;
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        dVar.f79235d = vq.j.a(biometricData);
        dVar.f79236e = zBooleanValue;
        dVar.f79239h = 2;
        if (W(dVar) != objE) {
            z15 = zBooleanValue;
            return vq.b.a(z15);
        }
        return objE;
    }

    @Override // f04.a
    public Object W(tq.e<? super BiometricData> eVar) {
        return d00.a.p(this.inMemoryCache, 556, 0L, new C1807b(null), eVar, 2, null);
    }

    @Override // wy.c
    public void clear() {
        this.inMemoryCache.n(556);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [h04.b$c, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [cz.b] */
    @Override // f04.a
    public Object e(tq.e<? super dx.i<? extends dx.b, b0>> eVar) throws Throwable {
        ?? cVar;
        Object objB;
        ex.c e15;
        b0 b0VarA;
        if (eVar instanceof c) {
            c cVar2 = (c) eVar;
            int i15 = cVar2.f79234p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f79234p = i15 - PKIFailureInfo.systemUnavail;
                cVar = cVar2;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f79232m;
        Object objE = uq.b.e();
        int i16 = cVar.f79234p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? R0 = r0();
                        String str = f79215g;
                        cVar.f79229j = jVarA;
                        cVar.f79230k = vq.j.a(aVar);
                        cVar.f79231l = vq.j.a(aVar);
                        cVar.f79224d = 0;
                        cVar.f79225e = 0;
                        cVar.f79226f = 0;
                        cVar.f79227g = 0;
                        cVar.f79228h = 0;
                        cVar.f79234p = 1;
                        Object objJ = R0.j(str, cVar);
                        if (objJ == objE) {
                            return objE;
                        }
                        obj = objJ;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        cVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(cVar));
                        dx.i iVarA = cVar.a(e);
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
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                String str2 = (String) obj;
                if (str2 == null || (b0VarA = c0.g(str2)) == null) {
                    b0VarA = b0.INSTANCE.a();
                }
                return new dx.i.Right(b0VarA);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
