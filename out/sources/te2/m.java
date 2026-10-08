package te2;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import oq.r;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zd2.ImageAttachments;
import zd2.Photo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lte2/m;", "Ll00/g;", "Lte2/b;", "Lte2/a;", "Lte2/c;", "", "Lyy/a;", "stateMachineFactory", "Lue2/b;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lbc4/e;", "createThumbnailUseCase", "Lb00/c;", "imageConverter", "Lte2/d;", "setupContract", "<init>", "(Lyy/a;Lue2/b;Lac4/a;Lbc4/e;Lb00/c;Lte2/d;)V", "state", "Lte2/c$a;", "r9", "(Lte2/b;)Lte2/c$a;", "b", "Lue2/b;", "c", "Lac4/a;", "d", "Lbc4/e;", "e", "Lb00/c;", "f", "Lte2/d;", "Lxw/b;", "Lte2/a$a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lte2/b$a;", "h", "Lte2/b$a;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<te2.b, te2.a> implements te2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ue2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.e createThumbnailUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final te2.d setupContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<te2.a.InterfaceC4941a> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final te2.b.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<te2.b, te2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<te2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<te2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f189947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f189948b;

        /* JADX INFO: renamed from: te2.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4945a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f189949a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f189950b;

            /* JADX INFO: renamed from: te2.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4946a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f189951d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f189952e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f189953f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f189955h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f189956j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f189957k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f189958l;

                public C4946a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f189951d = obj;
                    this.f189952e |= PKIFailureInfo.systemUnavail;
                    return C4945a.this.F(null, this);
                }
            }

            public C4945a(mu.h hVar, m mVar) {
                this.f189949a = hVar;
                this.f189950b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4946a c4946a;
                if (eVar instanceof C4946a) {
                    c4946a = (C4946a) eVar;
                    int i15 = c4946a.f189952e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4946a.f189952e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4946a = new C4946a(eVar);
                    }
                } else {
                    c4946a = new C4946a(eVar);
                }
                Object obj2 = c4946a.f189951d;
                Object objE = uq.b.e();
                int i16 = c4946a.f189952e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f189949a;
                    te2.c.a aVarR9 = this.f189950b.r9((te2.b) obj);
                    c4946a.f189953f = vq.j.a(obj);
                    c4946a.f189955h = vq.j.a(c4946a);
                    c4946a.f189956j = vq.j.a(obj);
                    c4946a.f189957k = vq.j.a(hVar);
                    c4946a.f189958l = 0;
                    c4946a.f189952e = 1;
                    if (hVar.F(aVarR9, c4946a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, m mVar) {
            this.f189947a = gVar;
            this.f189948b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super te2.c.a> hVar, tq.e eVar) {
            Object objA = this.f189947a.a(new C4945a(hVar, this.f189948b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lte2/a$b;", "<unused var>", "Lte2/b;", "Loq/i0;", "<anonymous>", "(Lte2/a$b;Lte2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<te2.a.b, te2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189959e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189959e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                te2.a.InterfaceC4941a.C4942a c4942a = te2.a.InterfaceC4941a.C4942a.f189915a;
                this.f189959e = 1;
                if (mVar.F(c4942a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(te2.a.b bVar, te2.b bVar2, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lte2/a$c;", "action", "Lte2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lte2/a$c;Lte2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<te2.a.OnShowImagePreview, te2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f189962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f189963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f189964h;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            te2.a.OnShowImagePreview onShowImagePreview = (te2.a.OnShowImagePreview) this.f189964h;
            Object objE = uq.b.e();
            int i15 = this.f189963g;
            if (i15 == 0) {
                u.b(obj);
                r<Photo, ImageAttachments> rVarL0 = m.this.setupContract.l0(onShowImagePreview.getThumbnail());
                if (rVarL0 == null) {
                    return i0.f148189a;
                }
                dx3.a.Content content = new dx3.a.Content(onShowImagePreview.getImageTitle(), rVarL0.c().getFile().getFileContent());
                m mVar = m.this;
                te2.a.InterfaceC4941a.ShowImagePreview showImagePreview = new te2.a.InterfaceC4941a.ShowImagePreview(content);
                this.f189964h = vq.j.a(onShowImagePreview);
                this.f189961e = vq.j.a(rVarL0);
                this.f189962f = vq.j.a(content);
                this.f189963g = 1;
                if (mVar.F(showImagePreview, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(te2.a.OnShowImagePreview onShowImagePreview, te2.b bVar, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f189964h = onShowImagePreview;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lte2/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lte2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<te2.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189966e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f189966e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.d9(te2.a.d.f189920a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(te2.b.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lte2/a$d;", "<unused var>", "Lk10/c0;", "Lte2/b$a;", "state", "Lk10/l;", "Lte2/b;", "<anonymous>", "(Lte2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<te2.a.d, c0<te2.b.a>, tq.e<? super k10.l<? extends te2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f189969f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lte2/b$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends te2.b.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f189971e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f189972f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f189973g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f189974h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f189975j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f189976k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f189977l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f189978m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f189979n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f189980p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f189981q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f189982r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f189983s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f189984t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f189985v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ m f189986w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ c0<te2.b.a> f189987x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, c0<te2.b.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f189986w = mVar;
                this.f189987x = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final te2.b.Initialized V(List list, te2.b.a aVar) {
                return new te2.b.Initialized(list);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x00b5  */
            /* JADX WARN: Code duplicated, block: B:16:0x0107  */
            /* JADX WARN: Code duplicated, block: B:19:0x0124  */
            /* JADX WARN: Code duplicated, block: B:21:0x012d  */
            /* JADX WARN: Code duplicated, block: B:23:0x0131  */
            /* JADX WARN: Code duplicated, block: B:26:0x017f  */
            /* JADX WARN: Code duplicated, block: B:29:0x01a6  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0124 -> B:20:0x012a). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x017f -> B:27:0x0183). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 442
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: te2.m.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f189986w, this.f189987x, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<te2.b.Initialized>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f189969f;
            Object objE = uq.b.e();
            int i15 = this.f189968e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ac4.a aVar = m.this.callActionWithLoaderUseCase;
            a aVar2 = new a(m.this, c0Var, null);
            this.f189969f = vq.j.a(c0Var);
            this.f189968e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(te2.a.d dVar, c0<te2.b.a> c0Var, tq.e<? super k10.l<? extends te2.b>> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f189969f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, ue2.b bVar, ac4.a aVar2, bc4.e eVar, b00.c cVar, te2.d dVar) {
        this.mapper = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.createThumbnailUseCase = eVar;
        this.imageConverter = cVar;
        this.setupContract = dVar;
        te2.b.a aVar3 = te2.b.a.f189921a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: te2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.u9(this.f189937a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), r9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final te2.c.a r9(te2.b state) {
        return this.mapper.b(new ue2.b.Params(state, b9(te2.a.b.f189917a), new er.p() { // from class: te2.i
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return m.s9(this.f189934a, (Label) obj, (o04.c) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(m mVar, Label label, o04.c cVar) {
        mVar.d9(new te2.a.OnShowImagePreview(label, cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final m mVar, v vVar) {
        vVar.c(q0.c(te2.b.class), new er.l() { // from class: te2.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.v9(this.f189935a, (z) obj);
            }
        });
        vVar.c(q0.c(te2.b.a.class), new er.l() { // from class: te2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.w9(this.f189936a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(te2.a.b.class), oVar, bVar);
        zVar.x(q0.c(te2.a.OnShowImagePreview.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(m mVar, z zVar) {
        zVar.C(mVar.new d(null));
        e eVar = mVar.new e(null);
        zVar.v(q0.c(te2.a.d.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<te2.a.InterfaceC4941a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<te2.b, te2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<te2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(te2.a.InterfaceC4941a interfaceC4941a, tq.e<? super i0> eVar) {
        return super.F(interfaceC4941a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(te2.d dVar) {
        super.P5(dVar);
    }
}
