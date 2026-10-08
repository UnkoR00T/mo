package jd;

import fr.w;
import ju.d2;
import ju.g2;
import ju.p0;
import ju.p2;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.n2;
import p076m2.x5;
import w0.b2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0018\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019Jl\u0010$\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b$\u0010%R+\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010\u0016\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R+\u0010\u001a\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R/\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u001c8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010\u001b\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010(\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0015R+\u0010#\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010(\u001a\u0004\bA\u0010*\"\u0004\bB\u0010,R\u001b\u0010F\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010>R/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010(\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010O\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010(\u001a\u0004\bM\u0010>\"\u0004\bN\u0010\u0015R+\u0010\u0012\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010\u0015R+\u0010W\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010(\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001b\u0010Y\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\bX\u0010>R\u001b\u0010[\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010D\u001a\u0004\b[\u0010*R\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010]R\u0014\u0010a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"Ljd/c;", "Ljd/b;", "<init>", "()V", "", "iterations", "", "I", "(ILtq/e;)Ljava/lang/Object;", "", "frameNanos", "O", "(IJ)Z", "", "Lfd/f;", "composition", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(FLfd/f;)F", "progress", "Loq/i0;", "b0", "(F)V", "iteration", "resetLastFrameNanos", "s", "(Lfd/f;FIZLtq/e;)Ljava/lang/Object;", "reverseOnRepeat", "speed", "Ljd/k;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Ljd/j;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "f", "(Lfd/f;IIZFLjd/k;FZLjd/j;ZZLtq/e;)Ljava/lang/Object;", "<set-?>", "a", "Lm2/a3;", "isPlaying", "()Z", "V", "(Z)V", "b", "r", "()I", ip.a.f96137b, "(I)V", "c", "n", "T", "d", "m", "Y", "e", "v", "()Ljd/k;", "Q", "(Ljd/k;)V", "o", "()F", "Z", "g", "N", "a0", "h", "Lm2/f6;", "K", "frameSpeed", "j", "u", "()Lfd/f;", "R", "(Lfd/f;)V", "k", "M", "X", "progressRaw", "l", "q", "W", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()J", "U", "(J)V", "lastFrameNanos", "J", "endProgress", "p", "isAtEnd", "Lw0/b2;", "Lw0/b2;", "mutex", "getValue", "()Ljava/lang/Float;", "value", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class c implements jd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 isPlaying;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 iteration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 iterations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 reverseOnRepeat;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a3 clipSpec;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 speed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 useCompositionFrameRate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final f6 frameSpeed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a3 composition;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a3 progressRaw;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a3 progress;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a3 lastFrameNanos;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final f6 endProgress;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final f6 isAtEnd;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final b2 mutex;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101671e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f101673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f101674h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f101675j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f101676k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ k f101677l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ fd.f f101678m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f101679n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f101680p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f101681q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ j f101682r;

        /* JADX INFO: renamed from: jd.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 9, 0})
        static final class C2405a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f101683e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ j f101684f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d2 f101685g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f101686h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f101687j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c f101688k;

            /* JADX INFO: renamed from: jd.c$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class C2406a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f101689a;

                static {
                    int[] iArr = new int[j.values().length];
                    try {
                        iArr[j.OnIterationFinish.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f101689a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2405a(j jVar, d2 d2Var, int i15, int i16, c cVar, tq.e<? super C2405a> eVar) {
                super(2, eVar);
                this.f101684f = jVar;
                this.f101685g = d2Var;
                this.f101686h = i15;
                this.f101687j = i16;
                this.f101688k = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0026  */
            /* JADX WARN: Code duplicated, block: B:15:0x0034 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Code duplicated, block: B:18:0x0040 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:21:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x0049
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r3.f101683e
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    oq.u.b(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    oq.u.b(r4)
                L1a:
                    jd.j r4 = r3.f101684f
                    int[] r1 = jd.c.a.C2405a.C2406a.f101689a
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    ju.d2 r4 = r3.f101685g
                    boolean r4 = r4.h()
                    if (r4 == 0) goto L31
                    int r4 = r3.f101686h
                    goto L36
                L31:
                    int r4 = r3.f101687j
                    goto L36
                L34:
                    int r4 = r3.f101686h
                L36:
                    jd.c r1 = r3.f101688k
                    r3.f101683e = r2
                    java.lang.Object r4 = jd.c.k(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    oq.i0 r4 = oq.i0.f148189a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: jd.c.a.C2405a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C2405a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C2405a(this.f101684f, this.f101685g, this.f101686h, this.f101687j, this.f101688k, eVar);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f101690a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.Immediately.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f101690a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i15, int i16, boolean z15, float f15, k kVar, fd.f fVar, float f16, boolean z16, boolean z17, j jVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f101673g = i15;
            this.f101674h = i16;
            this.f101675j = z15;
            this.f101676k = f15;
            this.f101677l = kVar;
            this.f101678m = fVar;
            this.f101679n = f16;
            this.f101680p = z16;
            this.f101681q = z17;
            this.f101682r = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            tq.i iVar;
            Object objE = uq.b.e();
            int i15 = this.f101671e;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    c.this.S(this.f101673g);
                    c.this.T(this.f101674h);
                    c.this.Y(this.f101675j);
                    c.this.Z(this.f101676k);
                    c.this.Q(this.f101677l);
                    c.this.R(this.f101678m);
                    c.this.b0(this.f101679n);
                    c.this.a0(this.f101680p);
                    if (!this.f101681q) {
                        c.this.U(Long.MIN_VALUE);
                    }
                    if (this.f101678m == null) {
                        c.this.V(false);
                        return i0.f148189a;
                    }
                    if (Float.isInfinite(this.f101676k)) {
                        c cVar = c.this;
                        cVar.b0(cVar.J());
                        c.this.V(false);
                        c.this.S(this.f101674h);
                        return i0.f148189a;
                    }
                    c.this.V(true);
                    int i16 = b.f101690a[this.f101682r.ordinal()];
                    if (i16 == 1) {
                        iVar = p2.f105770b;
                    } else {
                        if (i16 != 2) {
                            throw new oq.p();
                        }
                        iVar = tq.j.f191408a;
                    }
                    C2405a c2405a = new C2405a(this.f101682r, g2.k(getContext()), this.f101674h, this.f101673g, c.this, null);
                    this.f101671e = 1;
                    if (ju.i.g(iVar, c2405a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                g2.j(getContext());
                c.this.V(false);
                return i0.f148189a;
            } catch (Throwable th4) {
                c.this.V(false);
                throw th4;
            }
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new a(this.f101673g, this.f101674h, this.f101675j, this.f101676k, this.f101677l, this.f101678m, this.f101679n, this.f101680p, this.f101681q, this.f101682r, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameNanos", "", "c", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements er.l<Long, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f101692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i15) {
            super(1);
            this.f101692c = i15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(Long l15) {
            return c(l15.longValue());
        }

        public final Boolean c(long j15) {
            return Boolean.valueOf(c.this.O(this.f101692c, j15));
        }
    }

    /* JADX INFO: renamed from: jd.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameNanos", "", "c", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class C2407c extends w implements er.l<Long, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f101694c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2407c(int i15) {
            super(1);
            this.f101694c = i15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(Long l15) {
            return c(l15.longValue());
        }

        public final Boolean c(long j15) {
            return Boolean.valueOf(c.this.O(this.f101694c, j15));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class d extends w implements er.a<Float> {
        d() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float a() {
            fd.f fVarU = c.this.u();
            float fA = 0.0f;
            if (fVarU != null) {
                if (c.this.o() < 0.0f) {
                    k kVarV = c.this.v();
                    if (kVarV != null) {
                        fA = kVarV.b(fVarU);
                    }
                } else {
                    k kVarV2 = c.this.v();
                    fA = kVarV2 != null ? kVarV2.a(fVarU) : 1.0f;
                }
            }
            return Float.valueOf(fA);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class e extends w implements er.a<Float> {
        e() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float a() {
            return Float.valueOf((c.this.m() && c.this.r() % 2 == 0) ? -c.this.o() : c.this.o());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class f extends w implements er.a<Boolean> {
        f() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf(c.this.r() == c.this.n() && c.this.q() == c.this.J());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    static final class g extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101698e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fd.f f101700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f101701h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f101702j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f101703k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(fd.f fVar, float f15, int i15, boolean z15, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f101700g = fVar;
            this.f101701h = f15;
            this.f101702j = i15;
            this.f101703k = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101698e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            c.this.R(this.f101700g);
            c.this.b0(this.f101701h);
            c.this.S(this.f101702j);
            c.this.V(false);
            if (this.f101703k) {
                c.this.U(Long.MIN_VALUE);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new g(this.f101700g, this.f101701h, this.f101702j, this.f101703k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public c() {
        Boolean bool = Boolean.FALSE;
        this.isPlaying = c6.e(bool, null, 2, null);
        this.iteration = c6.e(1, null, 2, null);
        this.iterations = c6.e(1, null, 2, null);
        this.reverseOnRepeat = c6.e(bool, null, 2, null);
        this.clipSpec = c6.e(null, null, 2, null);
        this.speed = c6.e(Float.valueOf(1.0f), null, 2, null);
        this.useCompositionFrameRate = c6.e(bool, null, 2, null);
        this.frameSpeed = x5.d(new e());
        this.composition = c6.e(null, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.progressRaw = c6.e(fValueOf, null, 2, null);
        this.progress = c6.e(fValueOf, null, 2, null);
        this.lastFrameNanos = c6.e(Long.MIN_VALUE, null, 2, null);
        this.endProgress = x5.d(new d());
        this.isAtEnd = x5.d(new f());
        this.mutex = new b2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(int i15, tq.e<? super Boolean> eVar) {
        return i15 == Integer.MAX_VALUE ? u0.p0.a(new b(i15), eVar) : n2.c(new C2407c(i15), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float J() {
        return ((Number) this.endProgress.getValue()).floatValue();
    }

    private final float K() {
        return ((Number) this.frameSpeed.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float M() {
        return ((Number) this.progressRaw.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O(int iterations, long frameNanos) {
        fd.f fVarU = u();
        if (fVarU == null) {
            return true;
        }
        long jL = L() == Long.MIN_VALUE ? 0L : frameNanos - L();
        U(frameNanos);
        k kVarV = v();
        float fB = kVarV != null ? kVarV.b(fVarU) : 0.0f;
        k kVarV2 = v();
        float fA = kVarV2 != null ? kVarV2.a(fVarU) : 1.0f;
        float fD = ((jL / ((long) 1000000)) / fVarU.d()) * K();
        float fM = K() < 0.0f ? fB - (M() + fD) : (M() + fD) - fA;
        if (fB == fA) {
            b0(fB);
            return false;
        }
        if (fM < 0.0f) {
            b0(lr.m.m(M(), fB, fA) + fD);
        } else {
            float f15 = fA - fB;
            int i15 = (int) (fM / f15);
            int i16 = i15 + 1;
            if (r() + i16 > iterations) {
                b0(J());
                S(iterations);
                return false;
            }
            S(r() + i16);
            float f16 = fM - (i15 * f15);
            b0(K() < 0.0f ? fA - f16 : fB + f16);
        }
        return true;
    }

    private final float P(float f15, fd.f fVar) {
        if (fVar == null) {
            return f15;
        }
        return f15 - (f15 % (1 / fVar.i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(k kVar) {
        this.clipSpec.setValue(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(fd.f fVar) {
        this.composition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i15) {
        this.iteration.setValue(Integer.valueOf(i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i15) {
        this.iterations.setValue(Integer.valueOf(i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(long j15) {
        this.lastFrameNanos.setValue(Long.valueOf(j15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(boolean z15) {
        this.isPlaying.setValue(Boolean.valueOf(z15));
    }

    private void W(float f15) {
        this.progress.setValue(Float.valueOf(f15));
    }

    private final void X(float f15) {
        this.progressRaw.setValue(Float.valueOf(f15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(boolean z15) {
        this.reverseOnRepeat.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(float f15) {
        this.speed.setValue(Float.valueOf(f15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(boolean z15) {
        this.useCompositionFrameRate.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(float progress) {
        X(progress);
        if (N()) {
            progress = P(progress, u());
        }
        W(progress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long L() {
        return ((Number) this.lastFrameNanos.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean N() {
        return ((Boolean) this.useCompositionFrameRate.getValue()).booleanValue();
    }

    @Override // jd.b
    public Object f(fd.f fVar, int i15, int i16, boolean z15, float f15, k kVar, float f16, boolean z16, j jVar, boolean z17, boolean z18, tq.e<? super i0> eVar) {
        Object objE = b2.e(this.mutex, null, new a(i15, i16, z15, f15, kVar, fVar, f16, z18, z16, jVar, null), eVar, 1, null);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jd.i
    public boolean m() {
        return ((Boolean) this.reverseOnRepeat.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jd.i
    public int n() {
        return ((Number) this.iterations.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jd.i
    public float o() {
        return ((Number) this.speed.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jd.i
    public float q() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jd.i
    public int r() {
        return ((Number) this.iteration.getValue()).intValue();
    }

    @Override // jd.b
    public Object s(fd.f fVar, float f15, int i15, boolean z15, tq.e<? super i0> eVar) {
        Object objE = b2.e(this.mutex, null, new g(fVar, f15, i15, z15, null), eVar, 1, null);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jd.i
    public fd.f u() {
        return (fd.f) this.composition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jd.i
    public k v() {
        return (k) this.clipSpec.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p076m2.f6
    public Float getValue() {
        return Float.valueOf(q());
    }
}
