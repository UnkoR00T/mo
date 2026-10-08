package p13;

import android.net.Uri;
import fr.q0;
import ju.g2;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import yx.MediaPlayerState;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005:\u0001DBA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010A¨\u0006E"}, d2 = {"Lp13/x;", "Ll00/g;", "Lp13/i;", "", "Lp13/j;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lq13/m;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lyx/a;", "alarmAnnouncementMediaPlayer", "alarmCancellationMediaPlayer", "Lez/g;", "ticker", "<init>", "(Lyy/a;Lq13/m;La14/w;Li70/n;Lyx/a;Lyx/a;Lez/g;)V", "state", "Lp13/j$a;", "t9", "(Lp13/i;)Lp13/j$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lq13/m;", "c", "La14/w;", "d", "Li70/n;", "e", "Lyx/a;", "f", "g", "Lez/g;", "h", "Lp13/i;", "initialState", "Lxw/b;", "Lp13/b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "m", "a", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<State, Object> implements p13.j, zx.d, i70.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f151588n = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f151589p;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q13.m mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yx.a alarmAnnouncementMediaPlayer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yx.a alarmCancellationMediaPlayer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ez.g ticker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p13.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<p13.j.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<p13.j.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f151600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f151601b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f151602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f151603b;

            /* JADX INFO: renamed from: p13.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3730a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f151604d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f151605e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f151606f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f151608h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f151609j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f151610k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f151611l;

                public C3730a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f151604d = obj;
                    this.f151605e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f151602a = hVar;
                this.f151603b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3730a c3730a;
                if (eVar instanceof C3730a) {
                    c3730a = (C3730a) eVar;
                    int i15 = c3730a.f151605e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3730a.f151605e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3730a = new C3730a(eVar);
                    }
                } else {
                    c3730a = new C3730a(eVar);
                }
                Object obj2 = c3730a.f151604d;
                Object objE = uq.b.e();
                int i16 = c3730a.f151605e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f151602a;
                    p13.j.Data dataT9 = this.f151603b.t9((State) obj);
                    c3730a.f151606f = vq.j.a(obj);
                    c3730a.f151608h = vq.j.a(c3730a);
                    c3730a.f151609j = vq.j.a(obj);
                    c3730a.f151610k = vq.j.a(hVar);
                    c3730a.f151611l = 0;
                    c3730a.f151605e = 1;
                    if (hVar.F(dataT9, c3730a) == objE) {
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

        public b(mu.g gVar, x xVar) {
            this.f151600a = gVar;
            this.f151601b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p13.j.Data> hVar, tq.e eVar) {
            Object objA = this.f151600a.a(new a(hVar, this.f151601b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp13/h;", "action", "Lp13/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp13/h;Lp13/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<SeekTo, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151613f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f151615a;

            static {
                int[] iArr = new int[r13.a.values().length];
                try {
                    iArr[r13.a.ALARM_ANNOUNCEMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r13.a.ALARM_CANCELLATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f151615a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx.a aVar;
            SeekTo seekTo = (SeekTo) this.f151613f;
            uq.b.e();
            if (this.f151612e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f151615a[seekTo.getAlertMediaPlayer().ordinal()];
            if (i15 == 1) {
                aVar = x.this.alarmAnnouncementMediaPlayer;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                aVar = x.this.alarmCancellationMediaPlayer;
            }
            aVar.seekTo(seekTo.getPosition());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SeekTo seekTo, State state, tq.e<? super i0> eVar) {
            c cVar = x.this.new c(eVar);
            cVar.f151613f = seekTo;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp13/g;", "action", "Lp13/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp13/g;Lp13/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<Repeat, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151617f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f151619a;

            static {
                int[] iArr = new int[r13.a.values().length];
                try {
                    iArr[r13.a.ALARM_ANNOUNCEMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r13.a.ALARM_CANCELLATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f151619a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Repeat repeat = (Repeat) this.f151617f;
            uq.b.e();
            if (this.f151616e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f151619a[repeat.getAlertMediaPlayer().ordinal()];
            if (i15 == 1) {
                x.this.alarmAnnouncementMediaPlayer.d();
                x.this.alarmCancellationMediaPlayer.g();
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                x.this.alarmCancellationMediaPlayer.d();
                x.this.alarmAnnouncementMediaPlayer.g();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(Repeat repeat, State state, tq.e<? super i0> eVar) {
            d dVar = x.this.new d(eVar);
            dVar.f151617f = repeat;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp13/b;", "action", "Lp13/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp13/b;Lp13/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<p13.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151621f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p13.b bVar = (p13.b) this.f151621f;
            Object objE = uq.b.e();
            int i15 = this.f151620e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<p13.b> bVarY1 = x.this.Y1();
                this.f151621f = vq.j.a(bVar);
                this.f151620e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(p13.b bVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f151621f = bVar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp13/c;", "action", "Lp13/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp13/c;Lp13/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OpenUrl, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151624f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f151624f;
            Object objE = uq.b.e();
            int i15 = this.f151623e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = x.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f151624f = vq.j.a(openUrl);
                this.f151623e = 1;
                obj = wVar.c(params, this);
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
            x xVar = x.this;
            if (iVar instanceof dx.i.Left) {
                xVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, State state, tq.e<? super i0> eVar) {
            f fVar = x.this.new f(eVar);
            fVar.f151624f = openUrl;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lyx/c;", "item", "Lk10/c0;", "Lp13/i;", "state", "Lk10/l;", "<anonymous>", "(Lyx/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<MediaPlayerState, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f151628g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(MediaPlayerState mediaPlayerState, State state) {
            return State.b(state, mediaPlayerState, 0L, null, 0L, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final MediaPlayerState mediaPlayerState = (MediaPlayerState) this.f151627f;
            k10.c0 c0Var = (k10.c0) this.f151628g;
            uq.b.e();
            if (this.f151626e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: p13.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.O(mediaPlayerState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(MediaPlayerState mediaPlayerState, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f151627f = mediaPlayerState;
            gVar.f151628g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lyx/c;", "item", "Lk10/c0;", "Lp13/i;", "state", "Lk10/l;", "<anonymous>", "(Lyx/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<MediaPlayerState, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f151631g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(MediaPlayerState mediaPlayerState, State state) {
            return State.b(state, null, 0L, mediaPlayerState, 0L, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final MediaPlayerState mediaPlayerState = (MediaPlayerState) this.f151630f;
            k10.c0 c0Var = (k10.c0) this.f151631g;
            uq.b.e();
            if (this.f151629e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: p13.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.h.O(mediaPlayerState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(MediaPlayerState mediaPlayerState, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f151630f = mediaPlayerState;
            hVar.f151631g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgu/b;", "<unused var>", "Lk10/c0;", "Lp13/i;", "state", "Lk10/l;", "<anonymous>", "(Lgu/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<gu.b, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151633f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(x xVar, State state) {
            return State.b(state, null, xVar.alarmAnnouncementMediaPlayer.a(), null, xVar.alarmCancellationMediaPlayer.a(), 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f151633f;
            uq.b.e();
            if (this.f151632e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (!g2.n(getContext())) {
                return c0Var.c();
            }
            final x xVar = x.this;
            return c0Var.b(new er.l() { // from class: p13.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.O(xVar, (State) obj2);
                }
            });
        }

        public final Object N(long j15, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f151633f = c0Var;
            return iVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(gu.b bVar, k10.c0<State> c0Var, tq.e<? super k10.l<? extends State>> eVar) {
            return N(bVar.getRawValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp13/a;", "action", "Lp13/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp13/a;Lp13/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<InitializeMediaPlayer, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151636f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f151638a;

            static {
                int[] iArr = new int[r13.a.values().length];
                try {
                    iArr[r13.a.ALARM_ANNOUNCEMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r13.a.ALARM_CANCELLATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f151638a = iArr;
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx.a aVar;
            InitializeMediaPlayer initializeMediaPlayer = (InitializeMediaPlayer) this.f151636f;
            uq.b.e();
            if (this.f151635e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String string = new Uri.Builder().scheme("android.resource").path(String.valueOf(initializeMediaPlayer.getAlertMediaPlayer().getResourceId())).build().toString();
            int i15 = a.f151638a[initializeMediaPlayer.getAlertMediaPlayer().ordinal()];
            if (i15 == 1) {
                aVar = x.this.alarmAnnouncementMediaPlayer;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                aVar = x.this.alarmCancellationMediaPlayer;
            }
            aVar.c(string);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(InitializeMediaPlayer initializeMediaPlayer, State state, tq.e<? super i0> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f151636f = initializeMediaPlayer;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp13/f;", "action", "Lp13/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp13/f;Lp13/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ReleaseMediaPlayer, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151640f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f151642a;

            static {
                int[] iArr = new int[r13.a.values().length];
                try {
                    iArr[r13.a.ALARM_ANNOUNCEMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r13.a.ALARM_CANCELLATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f151642a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx.a aVar;
            ReleaseMediaPlayer releaseMediaPlayer = (ReleaseMediaPlayer) this.f151640f;
            uq.b.e();
            if (this.f151639e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f151642a[releaseMediaPlayer.getAlertMediaPlayer().ordinal()];
            if (i15 == 1) {
                aVar = x.this.alarmAnnouncementMediaPlayer;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                aVar = x.this.alarmCancellationMediaPlayer;
            }
            aVar.b();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ReleaseMediaPlayer releaseMediaPlayer, State state, tq.e<? super i0> eVar) {
            k kVar = x.this.new k(eVar);
            kVar.f151640f = releaseMediaPlayer;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp13/e;", "action", "Lp13/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp13/e;Lp13/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<Play, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151644f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f151646a;

            static {
                int[] iArr = new int[r13.a.values().length];
                try {
                    iArr[r13.a.ALARM_ANNOUNCEMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r13.a.ALARM_CANCELLATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f151646a = iArr;
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Play play = (Play) this.f151644f;
            uq.b.e();
            if (this.f151643e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f151646a[play.getAlertMediaPlayer().ordinal()];
            if (i15 == 1) {
                x.this.alarmAnnouncementMediaPlayer.h();
                x.this.alarmCancellationMediaPlayer.g();
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                x.this.alarmCancellationMediaPlayer.h();
                x.this.alarmAnnouncementMediaPlayer.g();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(Play play, State state, tq.e<? super i0> eVar) {
            l lVar = x.this.new l(eVar);
            lVar.f151644f = play;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp13/d;", "action", "Lp13/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp13/d;Lp13/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<Pause, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151648f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f151650a;

            static {
                int[] iArr = new int[r13.a.values().length];
                try {
                    iArr[r13.a.ALARM_ANNOUNCEMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r13.a.ALARM_CANCELLATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f151650a = iArr;
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx.a aVar;
            Pause pause = (Pause) this.f151648f;
            uq.b.e();
            if (this.f151647e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f151650a[pause.getAlertMediaPlayer().ordinal()];
            if (i15 == 1) {
                aVar = x.this.alarmAnnouncementMediaPlayer;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                aVar = x.this.alarmCancellationMediaPlayer;
            }
            aVar.g();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(Pause pause, State state, tq.e<? super i0> eVar) {
            m mVar = x.this.new m(eVar);
            mVar.f151648f = pause;
            return mVar.J(i0.f148189a);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f151589p = gu.d.q(250, gu.e.MILLISECONDS);
    }

    public x(yy.a aVar, q13.m mVar, a14.w wVar, i70.n nVar, yx.a aVar2, yx.a aVar3, ez.g gVar) {
        this.mapper = mVar;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.alarmAnnouncementMediaPlayer = aVar2;
        this.alarmCancellationMediaPlayer = aVar3;
        this.ticker = gVar;
        yx.b bVar = yx.b.IDLE;
        gu.b.Companion companion = gu.b.INSTANCE;
        State state = new State(new MediaPlayerState(bVar, companion.d(), null), companion.d(), new MediaPlayerState(bVar, companion.d(), null), companion.d(), null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: p13.o
            @Override // er.l
            public final Object b(Object obj) {
                return x.C9(this.f151578a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), t9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(x xVar, r13.a aVar) {
        xVar.d9(new Repeat(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: p13.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.D9(this.f151586a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(x xVar, k10.z zVar) {
        e eVar = xVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p13.b.class), oVar, eVar);
        zVar.x(q0.c(OpenUrl.class), oVar, xVar.new f(null));
        k10.k.m(zVar, xVar.alarmAnnouncementMediaPlayer.e(), null, new g(null), 2, null);
        k10.k.m(zVar, xVar.alarmCancellationMediaPlayer.e(), null, new h(null), 2, null);
        k10.k.m(zVar, xVar.ticker.a(f151589p), null, xVar.new i(null), 2, null);
        zVar.x(q0.c(InitializeMediaPlayer.class), oVar, xVar.new j(null));
        zVar.x(q0.c(ReleaseMediaPlayer.class), oVar, xVar.new k(null));
        zVar.x(q0.c(Play.class), oVar, xVar.new l(null));
        zVar.x(q0.c(Pause.class), oVar, xVar.new m(null));
        zVar.x(q0.c(SeekTo.class), oVar, xVar.new c(null));
        zVar.x(q0.c(Repeat.class), oVar, xVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p13.j.Data t9(State state) {
        return this.mapper.b(new q13.m.Params(state, b9(p13.b.a.f151542a), new er.l() { // from class: p13.p
            @Override // er.l
            public final Object b(Object obj) {
                return x.u9(this.f151579a, (String) obj);
            }
        }, new er.l() { // from class: p13.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.v9(this.f151580a, (r13.a) obj);
            }
        }, new er.l() { // from class: p13.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.w9(this.f151581a, (r13.a) obj);
            }
        }, new er.l() { // from class: p13.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.x9(this.f151582a, (r13.a) obj);
            }
        }, new er.l() { // from class: p13.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.y9(this.f151583a, (r13.a) obj);
            }
        }, new er.p() { // from class: p13.u
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return x.z9(this.f151584a, (r13.a) obj, ((Long) obj2).longValue());
            }
        }, new er.l() { // from class: p13.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.A9(this.f151585a, (r13.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(x xVar, String str) {
        xVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(x xVar, r13.a aVar) {
        xVar.d9(new InitializeMediaPlayer(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(x xVar, r13.a aVar) {
        xVar.d9(new ReleaseMediaPlayer(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(x xVar, r13.a aVar) {
        xVar.d9(new Play(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(x xVar, r13.a aVar) {
        xVar.d9(new Pause(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(x xVar, r13.a aVar, long j15) {
        xVar.d9(new SeekTo(aVar, j15));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<p13.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p13.j.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
