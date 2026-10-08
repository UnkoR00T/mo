package wc0;

import er.p;
import mu.g;
import mu.h;
import mu.i;
import oq.i0;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lwc0/b;", "", "Lgz/b$a$a;", "Lwc0/f;", "Lvc0/a;", "repository", "<init>", "(Lvc0/a;)V", "params", "Lmu/g;", "c", "(Lgz/b$a$a;)Lmu/g;", "a", "Lvc0/a;", "loginlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vc0.a repository;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "Lwc0/f;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<h<? super f>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f212048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f212049f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f212050g;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005e A[PHI: r7
          0x005e: PHI (r7v6 long) = (r7v2 long), (r7v4 long), (r7v8 long) binds: [B:19:0x0052, B:29:0x00a4, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:25:0x0077 A[PHI: r7
          0x0077: PHI (r7v5 long) = (r7v6 long), (r7v7 long) binds: [B:23:0x0074, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x008c A[PHI: r12
          0x008c: PHI (r12v8 java.lang.Object) = (r12v15 java.lang.Object), (r12v0 java.lang.Object) binds: [B:26:0x0089, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a4 -> B:20:0x005e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f212050g
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f212049f
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r2 == 0) goto L3c
                if (r2 == r7) goto L38
                if (r2 == r6) goto L32
                if (r2 == r5) goto L2e
                if (r2 == r4) goto L28
                if (r2 != r3) goto L20
                oq.u.b(r12)
                goto Lba
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                long r7 = r11.f212048e
                oq.u.b(r12)
                goto L5e
            L2e:
                oq.u.b(r12)
                goto L8c
            L32:
                long r7 = r11.f212048e
                oq.u.b(r12)
                goto L77
            L38:
                oq.u.b(r12)
                goto L52
            L3c:
                oq.u.b(r12)
                gu.b$a r12 = gu.b.INSTANCE
                wc0.b r12 = wc0.b.this
                vc0.a r12 = wc0.b.b(r12)
                r11.f212050g = r0
                r11.f212049f = r7
                java.lang.Object r12 = r12.d(r11)
                if (r12 != r1) goto L52
                goto Lb9
            L52:
                java.lang.Number r12 = (java.lang.Number) r12
                long r7 = r12.longValue()
                gu.e r12 = gu.e.MILLISECONDS
                long r7 = gu.d.r(r7, r12)
            L5e:
                boolean r12 = gu.b.T(r7)
                if (r12 == 0) goto La7
                wc0.f$a r12 = new wc0.f$a
                r2 = 0
                r12.<init>(r7, r2)
                r11.f212050g = r0
                r11.f212048e = r7
                r11.f212049f = r6
                java.lang.Object r12 = r0.F(r12, r11)
                if (r12 != r1) goto L77
                goto Lb9
            L77:
                gu.b$a r12 = gu.b.INSTANCE
                wc0.b r12 = wc0.b.this
                vc0.a r12 = wc0.b.b(r12)
                r11.f212050g = r0
                r11.f212048e = r7
                r11.f212049f = r5
                java.lang.Object r12 = r12.d(r11)
                if (r12 != r1) goto L8c
                goto Lb9
            L8c:
                java.lang.Number r12 = (java.lang.Number) r12
                long r7 = r12.longValue()
                gu.e r12 = gu.e.MILLISECONDS
                long r7 = gu.d.r(r7, r12)
                r11.f212050g = r0
                r11.f212048e = r7
                r11.f212049f = r4
                r9 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r12 = ju.z0.b(r9, r11)
                if (r12 != r1) goto L5e
                goto Lb9
            La7:
                wc0.f$b r12 = wc0.f.b.f212064a
                java.lang.Object r2 = vq.j.a(r0)
                r11.f212050g = r2
                r11.f212048e = r7
                r11.f212049f = r3
                java.lang.Object r12 = r0.F(r12, r11)
                if (r12 != r1) goto Lba
            Lb9:
                return r1
            Lba:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: wc0.b.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h<? super f> hVar, tq.e<? super i0> eVar) {
            return ((a) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = b.this.new a(eVar);
            aVar.f212050g = obj;
            return aVar;
        }
    }

    public b(vc0.a aVar) {
        this.repository = aVar;
    }

    public g<f> c(gz.b.a.C1792a params) {
        return i.I(new a(null));
    }
}
