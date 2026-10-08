package j1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lj1/d;", "Lj1/a;", "<init>", "()V", "Lm3/g;", "rect", "Loq/i0;", "b", "(Lm3/g;Ltq/e;)Ljava/lang/Object;", "Ln2/c;", "Lj1/h;", "a", "Ln2/c;", "e", "()Ln2/c;", "nodes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d implements j1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n2.c<h> nodes = new n2.c<>(new h[16], 0);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f98488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f98489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f98490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f98491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f98492h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f98494k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f98492h = obj;
            this.f98494k |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.g d(m3.g gVar) {
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:19:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // j1.a
    public java.lang.Object b(m3.g r9, tq.e<? super oq.i0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof j1.d.a
            if (r0 == 0) goto L13
            r0 = r10
            j1.d$a r0 = (j1.d.a) r0
            int r1 = r0.f98494k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98494k = r1
            goto L18
        L13:
            j1.d$a r0 = new j1.d$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f98492h
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f98494k
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r9 = r0.f98491g
            int r2 = r0.f98490f
            java.lang.Object r4 = r0.f98489e
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f98488d
            m3.g r5 = (m3.g) r5
            oq.u.b(r10)
            r10 = r5
            goto L6c
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            oq.u.b(r10)
            n2.c<j1.h> r10 = r8.nodes
            T[] r2 = r10.content
            int r10 = r10.getSize()
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r7
            r7 = r4
            r4 = r2
            r2 = r7
        L50:
            if (r2 >= r9) goto L6e
            r5 = r4[r2]
            j1.h r5 = (j1.h) r5
            j1.c r6 = new j1.c
            r6.<init>()
            r0.f98488d = r10
            r0.f98489e = r4
            r0.f98490f = r2
            r0.f98491g = r9
            r0.f98494k = r3
            java.lang.Object r5 = k4.b.a(r5, r6, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            int r2 = r2 + r3
            goto L50
        L6e:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.b(m3.g, tq.e):java.lang.Object");
    }

    public final n2.c<h> e() {
        return this.nodes;
    }
}
