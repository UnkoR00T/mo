package ge2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import vy.Coordinates;
import xw.PhoneNumber;
import zd2.ImageAttachments;
import zd2.NewIncidentData;
import zd2.Photo;
import zp0.BEIncidentReportFileImageConfiguration;
import zp0.BEIncidentReportFileServiceConfiguration;
import zp0.BEReportIncidentType;
import zp0.BEReportIncidentTypes;
import zp0.BEReportIncidentTypesIncidentTypeConfig;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J%\u0010:\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000200\u0018\u0001082\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00150<H\u0016¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u000200080\u0015H\u0016¢\u0006\u0004\b?\u0010\u0018J\u0011\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u0011\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020\u000e2\b\u0010M\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bP\u0010LJ\u0015\u0010Q\u001a\b\u0012\u0004\u0012\u00020J0<H\u0016¢\u0006\u0004\bQ\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010Z\u001a\b\u0012\u0004\u0012\u00020U0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030^8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010i\u001a\b\u0012\u0004\u0012\u00020\u00020d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lge2/w0;", "Ll00/g;", "Lge2/l;", "Lge2/k;", "Lge2/m;", "", "Lyy/a;", "stateMachineFactory", "Lez/a;", "currentTimeProvider", "Le14/f;", "getLocationUpdatesUseCase", "<init>", "(Lyy/a;Lez/a;Le14/f;)V", "Loq/i0;", "R6", "()V", "Lzp0/n;", "response", "k3", "(Lzp0/n;)V", "", "Lzp0/o;", "V6", "()Ljava/util/List;", "category", "v4", "(Lzp0/o;)V", "Lfz/b$d;", "e2", "()Lfz/b$d;", "dateTime", "A1", "(Lfz/b$d;)V", "Liy/b0;", "D1", "()Liy/b0;", "description", "x2", "(Liy/b0;)V", "Lxw/h;", "X3", "()Lxw/h;", "phoneNumber", "M2", "(Lxw/h;)V", "Lwx/i$a;", "file", "Lzd2/b;", "attachments", "i6", "(Lwx/i$a;Lzd2/b;)V", "Lo04/c;", "thumbnail", "s7", "(Lo04/c;)V", "Loq/r;", "Lzd2/d;", "l0", "(Lo04/c;)Loq/r;", "Lmu/g;", "V1", "()Lmu/g;", "c0", "Lzd2/c;", "Q4", "()Lzd2/c;", "Lzp0/f;", "l1", "()Lzp0/f;", "Lzp0/e;", "configuration", "Q5", "(Lzp0/e;)V", "Lvy/c;", "S0", "()Lvy/c;", "address", "a1", "(Lvy/c;)V", "N6", "m", "b", "Le14/f;", "Lxw/b;", "Lge2/k$b;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "d", "Lge2/l;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w0 extends l00.g<State, ge2.k> implements ge2.m, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e14.f getLocationUpdatesUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ge2.k.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, ge2.k> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<State> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<List<? extends Photo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f72215a;

        /* JADX INFO: renamed from: ge2.w0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1656a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f72216a;

            /* JADX INFO: renamed from: ge2.w0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1657a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f72217d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f72218e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f72219f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f72221h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f72222j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f72223k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f72224l;

                public C1657a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f72217d = obj;
                    this.f72218e |= PKIFailureInfo.systemUnavail;
                    return C1656a.this.F(null, this);
                }
            }

            public C1656a(mu.h hVar) {
                this.f72216a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1657a c1657a;
                if (eVar instanceof C1657a) {
                    c1657a = (C1657a) eVar;
                    int i15 = c1657a.f72218e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1657a.f72218e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1657a = new C1657a(eVar);
                    }
                } else {
                    c1657a = new C1657a(eVar);
                }
                Object obj2 = c1657a.f72217d;
                Object objE = uq.b.e();
                int i16 = c1657a.f72218e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f72216a;
                    List<oq.r<Photo, ImageAttachments>> listC = ((State) obj).c();
                    ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
                    Iterator<T> it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add((Photo) ((oq.r) it.next()).a());
                    }
                    c1657a.f72219f = vq.j.a(obj);
                    c1657a.f72221h = vq.j.a(c1657a);
                    c1657a.f72222j = vq.j.a(obj);
                    c1657a.f72223k = vq.j.a(hVar);
                    c1657a.f72224l = 0;
                    c1657a.f72218e = 1;
                    if (hVar.F(arrayList, c1657a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar) {
            this.f72215a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends Photo>> hVar, tq.e eVar) {
            Object objA = this.f72215a.a(new C1656a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<Coordinates> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f72225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f72226b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f72227a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w0 f72228b;

            /* JADX INFO: renamed from: ge2.w0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1658a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f72229d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f72230e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f72231f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f72233h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f72234j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f72235k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f72236l;

                public C1658a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f72229d = obj;
                    this.f72230e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w0 w0Var) {
                this.f72227a = hVar;
                this.f72228b = w0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1658a c1658a;
                Object objB;
                if (eVar instanceof C1658a) {
                    c1658a = (C1658a) eVar;
                    int i15 = c1658a.f72230e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1658a.f72230e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1658a = new C1658a(eVar);
                    }
                } else {
                    c1658a = new C1658a(eVar);
                }
                Object obj2 = c1658a.f72229d;
                Object objE = uq.b.e();
                int i16 = c1658a.f72230e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f72227a;
                    dx.i iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        objB = this.f72228b.getState().getValue().getLastCoordinates();
                        if (objB == null) {
                            objB = t04.b.f186822a.b();
                        }
                    } else {
                        if (!(iVar instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVar).b();
                    }
                    c1658a.f72231f = vq.j.a(obj);
                    c1658a.f72233h = vq.j.a(c1658a);
                    c1658a.f72234j = vq.j.a(obj);
                    c1658a.f72235k = vq.j.a(hVar);
                    c1658a.f72236l = 0;
                    c1658a.f72230e = 1;
                    if (hVar.F(objB, c1658a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, w0 w0Var) {
            this.f72225a = gVar;
            this.f72226b = w0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super Coordinates> hVar, tq.e eVar) {
            Object objA = this.f72225a.a(new a(hVar, this.f72226b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmu/h;", "Ldx/i;", "Ldx/b;", "Lvy/c;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<mu.h<? super dx.i<? extends dx.b, ? extends Coordinates>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72237e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f72237e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (w0.this.getState().getValue().getLastCoordinates() == null) {
                t04.b.f186822a.b();
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super dx.i<? extends dx.b, Coordinates>> hVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$e;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ge2.k.OnCategoryChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72241g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ge2.k.OnCategoryChanged onCategoryChanged, State state) {
            return State.b(state, null, null, null, null, onCategoryChanged.getCategory(), null, null, null, null, 495, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ge2.k.OnCategoryChanged onCategoryChanged = (ge2.k.OnCategoryChanged) this.f72240f;
            k10.c0 c0Var = (k10.c0) this.f72241g;
            uq.b.e();
            if (this.f72239e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ge2.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.d.O(onCategoryChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnCategoryChanged onCategoryChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f72240f = onCategoryChanged;
            dVar.f72241g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$h;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ge2.k.OnDeletePhotoByThumbnail, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72244g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, null, null, list, null, null, null, null, null, 503, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ge2.k.OnDeletePhotoByThumbnail onDeletePhotoByThumbnail = (ge2.k.OnDeletePhotoByThumbnail) this.f72243f;
            k10.c0 c0Var = (k10.c0) this.f72244g;
            uq.b.e();
            if (this.f72242e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            oq.r<Photo, ImageAttachments> rVarL0 = w0.this.l0(onDeletePhotoByThumbnail.getThumbnail());
            if (rVarL0 == null) {
                return c0Var.c();
            }
            final List listI1 = pq.v.i1(((State) c0Var.a()).c());
            listI1.remove(rVarL0);
            return c0Var.b(new er.l() { // from class: ge2.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.e.O(listI1, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnDeletePhotoByThumbnail onDeletePhotoByThumbnail, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = w0.this.new e(eVar);
            eVar2.f72243f = onDeletePhotoByThumbnail;
            eVar2.f72244g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$c;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ge2.k.OnAddNewPhoto, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72248g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, null, null, list, null, null, null, null, null, 503, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ge2.k.OnAddNewPhoto onAddNewPhoto = (ge2.k.OnAddNewPhoto) this.f72247f;
            k10.c0 c0Var = (k10.c0) this.f72248g;
            uq.b.e();
            if (this.f72246e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final List listI1 = pq.v.i1(((State) c0Var.a()).c());
            listI1.add(oq.y.a(new Photo(onAddNewPhoto.getFile(), null), onAddNewPhoto.getAttachments()));
            return c0Var.b(new er.l() { // from class: ge2.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.f.O(listI1, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnAddNewPhoto onAddNewPhoto, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f72247f = onAddNewPhoto;
            fVar.f72248g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldx/i;", "Ldx/b;", "Lvy/c;", "resultCoordinates", "Lge2/l;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx/i;Lge2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dx.i<? extends dx.b, ? extends Coordinates>, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72250f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f72250f;
            uq.b.e();
            if (this.f72249e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Coordinates coordinates = (Coordinates) iVar.a();
            if (coordinates != null) {
                w0.this.d9(new ge2.k.OnLastCoordinatesChanged(coordinates));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, Coordinates> iVar, State state, tq.e<? super oq.i0> eVar) {
            g gVar = w0.this.new g(eVar);
            gVar.f72250f = iVar;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lge2/k$a;", "<unused var>", "Lge2/l;", "Loq/i0;", "<anonymous>", "(Lge2/k$a;Lge2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ge2.k.a, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72252e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f72252e;
            if (i15 == 0) {
                oq.u.b(obj);
                w0 w0Var = w0.this;
                ge2.k.b.a aVar = ge2.k.b.a.f72154a;
                this.f72252e = 1;
                if (w0Var.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.a aVar, State state, tq.e<? super oq.i0> eVar) {
            return w0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$l;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ge2.k.OnSelectedIncidentLocalizationChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72256g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ge2.k.OnSelectedIncidentLocalizationChanged onSelectedIncidentLocalizationChanged, State state) {
            return State.b(state, null, null, null, null, null, null, null, onSelectedIncidentLocalizationChanged.getLocation(), null, 383, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ge2.k.OnSelectedIncidentLocalizationChanged onSelectedIncidentLocalizationChanged = (ge2.k.OnSelectedIncidentLocalizationChanged) this.f72255f;
            k10.c0 c0Var = (k10.c0) this.f72256g;
            uq.b.e();
            if (this.f72254e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ge2.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.i.O(onSelectedIncidentLocalizationChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnSelectedIncidentLocalizationChanged onSelectedIncidentLocalizationChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f72255f = onSelectedIncidentLocalizationChanged;
            iVar.f72256g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$k;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ge2.k.OnLastCoordinatesChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72259g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ge2.k.OnLastCoordinatesChanged onLastCoordinatesChanged, State state) {
            return State.b(state, onLastCoordinatesChanged.getNewCoordinates(), null, null, null, null, null, null, null, null, 510, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ge2.k.OnLastCoordinatesChanged onLastCoordinatesChanged = (ge2.k.OnLastCoordinatesChanged) this.f72258f;
            k10.c0 c0Var = (k10.c0) this.f72259g;
            uq.b.e();
            if (this.f72257e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ge2.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.j.O(onLastCoordinatesChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnLastCoordinatesChanged onLastCoordinatesChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f72258f = onLastCoordinatesChanged;
            jVar.f72259g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$f;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ge2.k.OnContactDetailsChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72262g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ge2.k.OnContactDetailsChanged onContactDetailsChanged, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, onContactDetailsChanged.getPhoneNumber(), GF2Field.MASK, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ge2.k.OnContactDetailsChanged onContactDetailsChanged = (ge2.k.OnContactDetailsChanged) this.f72261f;
            k10.c0 c0Var = (k10.c0) this.f72262g;
            uq.b.e();
            if (this.f72260e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ge2.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.k.O(onContactDetailsChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnContactDetailsChanged onContactDetailsChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f72261f = onContactDetailsChanged;
            kVar.f72262g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$i;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ge2.k.OnDescriptionChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72265g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ge2.k.OnDescriptionChanged onDescriptionChanged, State state) {
            return State.b(state, null, null, null, null, null, null, onDescriptionChanged.getDescription(), null, null, 447, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ge2.k.OnDescriptionChanged onDescriptionChanged = (ge2.k.OnDescriptionChanged) this.f72264f;
            k10.c0 c0Var = (k10.c0) this.f72265g;
            uq.b.e();
            if (this.f72263e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ge2.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.l.O(onDescriptionChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnDescriptionChanged onDescriptionChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f72264f = onDescriptionChanged;
            lVar.f72265g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$g;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ge2.k.OnDateTimeChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72268g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ge2.k.OnDateTimeChanged onDateTimeChanged, State state) {
            return State.b(state, null, null, null, null, null, onDateTimeChanged.getDateTime(), null, null, null, 479, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ge2.k.OnDateTimeChanged onDateTimeChanged = (ge2.k.OnDateTimeChanged) this.f72267f;
            k10.c0 c0Var = (k10.c0) this.f72268g;
            uq.b.e();
            if (this.f72266e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ge2.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.m.O(onDateTimeChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnDateTimeChanged onDateTimeChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f72267f = onDateTimeChanged;
            mVar.f72268g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$d;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ge2.k.OnCategoriesLoaded, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72271g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ge2.k.OnCategoriesLoaded onCategoriesLoaded, State state) {
            return State.b(state, null, onCategoriesLoaded.getResponse().getImageConfig(), onCategoriesLoaded.getResponse().b(), null, null, null, null, null, null, 505, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ge2.k.OnCategoriesLoaded onCategoriesLoaded = (ge2.k.OnCategoriesLoaded) this.f72270f;
            k10.c0 c0Var = (k10.c0) this.f72271g;
            uq.b.e();
            if (this.f72269e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ge2.f1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.n.O(onCategoriesLoaded, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnCategoriesLoaded onCategoriesLoaded, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f72270f = onCategoriesLoaded;
            nVar.f72271g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lge2/k$j;", "action", "Lk10/c0;", "Lge2/l;", "state", "Lk10/l;", "<anonymous>", "(Lge2/k$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ge2.k.OnFileConfigurationChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72274g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ge2.k.OnFileConfigurationChanged onFileConfigurationChanged, State state) {
            return State.b(state, null, onFileConfigurationChanged.getConfiguration(), null, null, null, null, null, null, null, 509, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ge2.k.OnFileConfigurationChanged onFileConfigurationChanged = (ge2.k.OnFileConfigurationChanged) this.f72273f;
            k10.c0 c0Var = (k10.c0) this.f72274g;
            uq.b.e();
            if (this.f72272e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ge2.g1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.o.O(onFileConfigurationChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ge2.k.OnFileConfigurationChanged onFileConfigurationChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = new o(eVar);
            oVar.f72273f = onFileConfigurationChanged;
            oVar.f72274g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    public w0(yy.a aVar, ez.a aVar2, e14.f fVar) {
        this.getLocationUpdatesUseCase = fVar;
        State state = new State(null, null, pq.v.n(), pq.v.n(), null, new fz.b.LocalDateTime(aVar2.i()), null, null, null, 1, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ge2.u0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.l9(this.f72206a, (k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l9(final w0 w0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: ge2.v0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.m9(this.f72208a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m9(w0 w0Var, k10.z zVar) {
        k10.k.s(zVar, (mu.g) w0Var.getLocationUpdatesUseCase.a(gz.b.a.C1792a.f78542a), null, w0Var.new g(null), 2, null);
        h hVar = w0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ge2.k.a.class), oVar, hVar);
        zVar.v(fr.q0.c(ge2.k.OnSelectedIncidentLocalizationChanged.class), oVar, new i(null));
        zVar.v(fr.q0.c(ge2.k.OnLastCoordinatesChanged.class), oVar, new j(null));
        zVar.v(fr.q0.c(ge2.k.OnContactDetailsChanged.class), oVar, new k(null));
        zVar.v(fr.q0.c(ge2.k.OnDescriptionChanged.class), oVar, new l(null));
        zVar.v(fr.q0.c(ge2.k.OnDateTimeChanged.class), oVar, new m(null));
        zVar.v(fr.q0.c(ge2.k.OnCategoriesLoaded.class), oVar, new n(null));
        zVar.v(fr.q0.c(ge2.k.OnFileConfigurationChanged.class), oVar, new o(null));
        zVar.v(fr.q0.c(ge2.k.OnCategoryChanged.class), oVar, new d(null));
        zVar.v(fr.q0.c(ge2.k.OnDeletePhotoByThumbnail.class), oVar, w0Var.new e(null));
        zVar.v(fr.q0.c(ge2.k.OnAddNewPhoto.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    @Override // le2.f
    public void A1(fz.b.LocalDateTime dateTime) {
        d9(new ge2.k.OnDateTimeChanged(dateTime));
    }

    @Override // le2.f
    public iy.b0 D1() {
        return getState().getValue().getDescription();
    }

    @Override // je2.e
    public void M2(PhoneNumber phoneNumber) {
        d9(new ge2.k.OnContactDetailsChanged(phoneNumber));
    }

    @Override // xe2.e
    public Coordinates N6() {
        return getState().getValue().getLastCoordinates();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    @Override // xe2.e
    public NewIncidentData Q4() {
        BEReportIncidentType type;
        Coordinates selectedIncidentLocalization;
        BEReportIncidentTypesIncidentTypeConfig selectedCategory = getState().getValue().getSelectedCategory();
        PhoneNumber phoneNumberA = null;
        if (selectedCategory == null || (type = selectedCategory.getType()) == null || (selectedIncidentLocalization = getState().getValue().getSelectedIncidentLocalization()) == null) {
            return null;
        }
        PhoneNumber phoneNumber = getState().getValue().getPhoneNumber();
        if (phoneNumber != null) {
            iy.b0 prefix = phoneNumber.getPrefix();
            iy.b0 number = phoneNumber.getNumber();
            if (iy.c0.c(prefix) != null && iy.c0.c(number) != null) {
                phoneNumberA = phoneNumber;
            }
            if (phoneNumberA == null) {
                phoneNumberA = PhoneNumber.INSTANCE.a();
            }
        } else {
            phoneNumberA = PhoneNumber.INSTANCE.a();
        }
        return new NewIncidentData(type.getCode(), type.getName(), getState().getValue().getIncidentDateTime(), selectedIncidentLocalization, getState().getValue().getDescription(), phoneNumberA, getState().getValue().c());
    }

    @Override // xe2.e
    public void Q5(BEIncidentReportFileImageConfiguration configuration) {
        d9(new ge2.k.OnFileConfigurationChanged(configuration));
    }

    @Override // ge2.m
    public void R6() {
        d9(ge2.k.a.f72153a);
    }

    @Override // le2.f, ne2.f
    public Coordinates S0() {
        return getState().getValue().getSelectedIncidentLocalization();
    }

    @Override // re2.g
    public mu.g<List<Photo>> V1() {
        return new a(getState());
    }

    @Override // he2.e
    public List<BEReportIncidentTypesIncidentTypeConfig> V6() {
        return getState().getValue().f();
    }

    @Override // je2.e
    public PhoneNumber X3() {
        return getState().getValue().getPhoneNumber();
    }

    @Override // zx.b
    public xw.b<ge2.k.b> Y1() {
        return this.navAction;
    }

    @Override // ne2.f
    public void a1(Coordinates address) {
        d9(new ge2.k.OnSelectedIncidentLocalizationChanged(address));
    }

    @Override // te2.d, re2.g
    public List<oq.r<Photo, ImageAttachments>> c0() {
        return getState().getValue().c();
    }

    @Override // le2.f
    public fz.b.LocalDateTime e2() {
        return getState().getValue().getIncidentDateTime();
    }

    @Override // l00.g
    protected k10.t<State, ge2.k> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<State> getState() {
        return this.state;
    }

    @Override // re2.g
    public void i6(wx.i.Image file, ImageAttachments attachments) {
        d9(new ge2.k.OnAddNewPhoto(file, attachments));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ge2.k.b bVar, tq.e<? super oq.i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // re2.g
    public void k3(BEReportIncidentTypes response) {
        d9(new ge2.k.OnCategoriesLoaded(response));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // te2.d, re2.g
    public oq.r<Photo, ImageAttachments> l0(o04.c thumbnail) {
        Object next;
        Iterator<T> it = getState().getValue().c().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (fr.t.c(((Photo) ((oq.r) next).c()).getFile().getMetadata(), thumbnail.getOriginalMetadata())) {
                return (oq.r) next;
            }
        }
        next = null;
        return (oq.r) next;
    }

    @Override // xe2.e
    public BEIncidentReportFileServiceConfiguration l1() {
        BEIncidentReportFileImageConfiguration imageConfig = getState().getValue().getImageConfig();
        if (imageConfig != null) {
            return imageConfig.getFilesServiceConfiguration();
        }
        return null;
    }

    @Override // ne2.f
    public mu.g<Coordinates> m() {
        return mu.i.a0(new b(mu.i.U((mu.g) this.getLocationUpdatesUseCase.a(gz.b.a.C1792a.f78542a), new c(null)), this), androidx.p016lifecycle.u0.a(this), mu.l0.Companion.b(mu.l0.INSTANCE, 0L, 0L, 3, null), 1);
    }

    @Override // re2.g
    public void s7(o04.c thumbnail) {
        d9(new ge2.k.OnDeletePhotoByThumbnail(thumbnail));
    }

    @Override // he2.e
    public void v4(BEReportIncidentTypesIncidentTypeConfig category) {
        d9(new ge2.k.OnCategoryChanged(category));
    }

    @Override // le2.f
    public void x2(iy.b0 description) {
        d9(new ge2.k.OnDescriptionChanged(description));
    }
}
