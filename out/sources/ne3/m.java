package ne3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pe3.DownloadPhotosSetupData;
import pq.v;
import sv0.Download;
import sv0.StatementVehicleDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lne3/m;", "Ll00/g;", "Lne3/b;", "Lne3/a;", "Lne3/c;", "", "Lyy/a;", "stateMachineFactory", "Loe3/a;", "mapper", "Lib4/c;", "domainErrorMapper", "Li70/e;", "globalSnackBarManager", "Lae3/d;", "downloadAndSavePhotosUC", "Lmx/c;", "labelProvider", "Lde3/b;", "isDownloadTokenExpiredErrorUC", "Lde3/a;", "createDownloadTokenExpiredErrorUC", "Lpe3/a;", "downloadPhotosSetupData", "<init>", "(Lyy/a;Loe3/a;Lib4/c;Li70/e;Lae3/d;Lmx/c;Lde3/b;Lde3/a;Lpe3/a;)V", "Ldx/b;", "domainError", "Loq/i0;", "t9", "(Ldx/b;)V", "Lne3/c$a;", "u9", "(Lne3/b;)Lne3/c$a;", "b", "Loe3/a;", "c", "Lib4/c;", "d", "Li70/e;", "e", "Lae3/d;", "f", "Lmx/c;", "g", "Lde3/b;", "h", "Lde3/a;", "j", "Lpe3/a;", "k", "Lne3/b;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lne3/a$d;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, ne3.a> implements ne3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oe3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ae3.d downloadAndSavePhotosUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final de3.b isDownloadTokenExpiredErrorUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final de3.a createDownloadTokenExpiredErrorUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final DownloadPhotosSetupData downloadPhotosSetupData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, ne3.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ne3.a.d> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<ne3.c.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135304e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f135306g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dx.b bVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f135306g = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(m mVar, ib4.c.b bVar) {
            mVar.d9(ne3.a.g.f135274a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y(m mVar, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                mVar.d9(ne3.a.f.f135273a);
            } else {
                mVar.d9(ne3.a.C3347a.f135264a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ib4.c.Params params;
            Object objE = uq.b.e();
            int i15 = this.f135304e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                ib4.c cVar = m.this.domainErrorMapper;
                if (m.this.isDownloadTokenExpiredErrorUC.b(new de3.b.Params(this.f135306g)).booleanValue()) {
                    dx.b.Business businessB = m.this.createDownloadTokenExpiredErrorUC.b(de3.a.InterfaceC0924a.C0925a.f41291a);
                    final m mVar2 = m.this;
                    params = new ib4.c.Params(businessB, false, new er.l() { // from class: ne3.k
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return m.a.X(mVar2, (ib4.c.b) obj2);
                        }
                    }, 2, null);
                } else {
                    dx.b bVar = this.f135306g;
                    final m mVar3 = m.this;
                    params = new ib4.c.Params(bVar, false, new er.l() { // from class: ne3.l
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return m.a.Y(mVar3, (ib4.c.b) obj2);
                        }
                    }, 2, null);
                }
                ne3.a.d.ShowError showError = new ne3.a.d.ShowError(cVar.b(params));
                this.f135304e = 1;
                if (mVar.F(showError, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> O(tq.e<?> eVar) {
            return m.this.new a(this.f135306g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) O(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ne3.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f135307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f135308b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f135309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f135310b;

            /* JADX INFO: renamed from: ne3.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3350a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f135311d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f135312e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f135313f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f135315h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f135316j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f135317k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f135318l;

                public C3350a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f135311d = obj;
                    this.f135312e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f135309a = hVar;
                this.f135310b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3350a c3350a;
                if (eVar instanceof C3350a) {
                    c3350a = (C3350a) eVar;
                    int i15 = c3350a.f135312e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3350a.f135312e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3350a = new C3350a(eVar);
                    }
                } else {
                    c3350a = new C3350a(eVar);
                }
                Object obj2 = c3350a.f135311d;
                Object objE = uq.b.e();
                int i16 = c3350a.f135312e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f135309a;
                    ne3.c.Data dataU9 = this.f135310b.u9((State) obj);
                    c3350a.f135313f = vq.j.a(obj);
                    c3350a.f135315h = vq.j.a(c3350a);
                    c3350a.f135316j = vq.j.a(obj);
                    c3350a.f135317k = vq.j.a(hVar);
                    c3350a.f135318l = 0;
                    c3350a.f135312e = 1;
                    if (hVar.F(dataU9, c3350a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, m mVar) {
            this.f135307a = gVar;
            this.f135308b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ne3.c.Data> hVar, tq.e eVar) {
            Object objA = this.f135307a.a(new a(hVar, this.f135308b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lne3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lne3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135319e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f135319e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m.this.d9(ne3.a.c.f135266a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((c) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne3/a$a;", "<unused var>", "Lne3/b;", "Loq/i0;", "<anonymous>", "(Lne3/a$a;Lne3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ne3.a.C3347a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135321e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f135321e;
            if (i15 == 0) {
                oq.u.b(obj);
                m.this.d9(ne3.a.b.f135265a);
                m mVar = m.this;
                ne3.a.d.C3348a c3348a = ne3.a.d.C3348a.f135267a;
                this.f135321e = 1;
                if (mVar.F(c3348a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne3.a.C3347a c3347a, State state, tq.e<? super i0> eVar) {
            return m.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lne3/a$b;", "<unused var>", "Lne3/b;", "state", "Loq/i0;", "<anonymous>", "(Lne3/a$b;Lne3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ne3.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135324f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f135324f;
            uq.b.e();
            if (this.f135323e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (state.getIsDialogVisible()) {
                m.this.d9(ne3.a.C3347a.f135264a);
                m.this.d9(ne3.a.e.f135272a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne3.a.b bVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f135324f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lne3/a$e;", "<unused var>", "Lk10/c0;", "Lne3/b;", "state", "Lk10/l;", "<anonymous>", "(Lne3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ne3.a.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135327f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f135327f;
            uq.b.e();
            if (this.f135326e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ne3.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne3.a.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            f fVar = new f(eVar2);
            fVar.f135327f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne3/a$f;", "<unused var>", "Lne3/b;", "Loq/i0;", "<anonymous>", "(Lne3/a$f;Lne3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ne3.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135328e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f135328e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m.this.d9(ne3.a.c.f135266a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne3.a.f fVar, State state, tq.e<? super i0> eVar) {
            return m.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lne3/a$h;", "<unused var>", "Lk10/c0;", "Lne3/b;", "state", "Lk10/l;", "<anonymous>", "(Lne3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ne3.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135331f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y(m mVar) {
            mVar.d9(ne3.a.e.f135272a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Z(m mVar) {
            mVar.d9(ne3.a.e.f135272a);
            mVar.d9(ne3.a.C3347a.f135264a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 a0(m mVar) {
            mVar.d9(ne3.a.e.f135272a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State b0(State state) {
            return state.a(true);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f135331f;
            Object objE = uq.b.e();
            int i15 = this.f135330e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                cb4.h.b bVar = cb4.h.b.f24985a;
                Label labelC = m.this.labelProvider.c(md3.b.f125846v2);
                Label labelC2 = m.this.labelProvider.c(md3.b.f125838u2);
                Label labelC3 = m.this.labelProvider.c(md3.b.f125699d);
                final m mVar2 = m.this;
                DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(labelC3, null, new er.a() { // from class: ne3.o
                    @Override // er.a
                    public final Object a() {
                        return m.h.Y(mVar2);
                    }
                }, 2, null);
                Label labelC4 = m.this.labelProvider.c(md3.b.f125707e);
                final m mVar3 = m.this;
                DialogButtonTextData dialogButtonTextData2 = new DialogButtonTextData(labelC4, null, new er.a() { // from class: ne3.p
                    @Override // er.a
                    public final Object a() {
                        return m.h.Z(mVar3);
                    }
                }, 2, null);
                final m mVar4 = m.this;
                ne3.a.d.ShowExitDialog showExitDialog = new ne3.a.d.ShowExitDialog(new DialogData(bVar, labelC, labelC2, dialogButtonTextData, dialogButtonTextData2, null, new er.a() { // from class: ne3.q
                    @Override // er.a
                    public final Object a() {
                        return m.h.a0(mVar4);
                    }
                }, 32, null));
                this.f135331f = c0Var;
                this.f135330e = 1;
                if (mVar.F(showExitDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: ne3.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.h.b0((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object w(ne3.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar2 = m.this.new h(eVar);
            hVar2.f135331f = c0Var;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne3/a$c;", "<unused var>", "Lne3/b;", "Loq/i0;", "<anonymous>", "(Lne3/a$c;Lne3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ne3.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135333e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f135333e;
            if (i15 == 0) {
                oq.u.b(obj);
                ae3.d dVar = m.this.downloadAndSavePhotosUC;
                Download initialConfiguration = m.this.downloadPhotosSetupData.getInitialConfiguration();
                List<StatementVehicleDetails.Image> listB = m.this.downloadPhotosSetupData.b();
                ArrayList arrayList = new ArrayList(v.y(listB, 10));
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StatementVehicleDetails.Image) it.next()).getOriginal());
                }
                ae3.d.Params params = new ae3.d.Params(initialConfiguration, arrayList);
                this.f135333e = 1;
                obj = dVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            m mVar = m.this;
            if (iVar instanceof dx.i.Right) {
                mVar.globalSnackBarManager.y(new p50.a.Default(mVar.labelProvider.c(md3.b.f125803q), true, null, 4, null));
                mVar.d9(ne3.a.C3347a.f135264a);
            }
            m mVar2 = m.this;
            if (iVar instanceof dx.i.Left) {
                mVar2.t9((dx.b) ((dx.i.Left) iVar).b());
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne3.a.c cVar, State state, tq.e<? super i0> eVar) {
            return m.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne3/a$g;", "<unused var>", "Lne3/b;", "Loq/i0;", "<anonymous>", "(Lne3/a$g;Lne3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ne3.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135335e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f135335e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ne3.a.d> bVarY1 = m.this.Y1();
                ne3.a.d.RefreshDownloadToken refreshDownloadToken = new ne3.a.d.RefreshDownloadToken(m.this.downloadPhotosSetupData.getEnteredFrom(), m.this.downloadPhotosSetupData.getProcessId());
                this.f135335e = 1;
                if (bVarY1.F(refreshDownloadToken, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne3.a.g gVar, State state, tq.e<? super i0> eVar) {
            return m.this.new j(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, oe3.a aVar2, ib4.c cVar, i70.e eVar, ae3.d dVar, mx.c cVar2, de3.b bVar, de3.a aVar3, DownloadPhotosSetupData downloadPhotosSetupData) {
        this.mapper = aVar2;
        this.domainErrorMapper = cVar;
        this.globalSnackBarManager = eVar;
        this.downloadAndSavePhotosUC = dVar;
        this.labelProvider = cVar2;
        this.isDownloadTokenExpiredErrorUC = bVar;
        this.createDownloadTokenExpiredErrorUC = aVar3;
        this.downloadPhotosSetupData = downloadPhotosSetupData;
        State state = new State(false);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ne3.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.w9(this.f135289a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), u9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t9(dx.b domainError) {
        i00.a.a(this, new a(domainError, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ne3.c.Data u9(State state) {
        return this.mapper.b(new oe3.a.Params(state, b9(ne3.a.C3347a.f135264a), b9(ne3.a.h.f135275a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final m mVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ne3.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.x9(this.f135288a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(m mVar, z zVar) {
        zVar.C(mVar.new c(null));
        d dVar = mVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ne3.a.C3347a.class), oVar, dVar);
        zVar.x(q0.c(ne3.a.b.class), oVar, mVar.new e(null));
        zVar.v(q0.c(ne3.a.e.class), oVar, new f(null));
        zVar.x(q0.c(ne3.a.f.class), oVar, mVar.new g(null));
        zVar.v(q0.c(ne3.a.h.class), oVar, mVar.new h(null));
        zVar.x(q0.c(ne3.a.c.class), oVar, mVar.new i(null));
        zVar.x(q0.c(ne3.a.g.class), oVar, mVar.new j(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ne3.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, ne3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ne3.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ne3.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DownloadPhotosSetupData downloadPhotosSetupData) {
        super.P5(downloadPhotosSetupData);
    }
}
