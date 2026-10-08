package qa;

import java.util.Arrays;
import oa.u;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Loa/u;", "db", "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Lya/b;", "block", "Lmu/g;", "a", "(Loa/u;Z[Ljava/lang/String;Ler/l;)Lmu/g;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> implements mu.g<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f165455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f165456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f165457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.l f165458d;

        /* JADX INFO: renamed from: qa.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class C4128a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f165459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f165460b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f165461c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ er.l f165462d;

            /* JADX INFO: renamed from: qa.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C4129a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f165463d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f165464e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f165465f;

                public C4129a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f165463d = obj;
                    this.f165464e |= PKIFailureInfo.systemUnavail;
                    return C4128a.this.F(null, this);
                }
            }

            public C4128a(mu.h hVar, u uVar, boolean z15, er.l lVar) {
                this.f165459a = hVar;
                this.f165460b = uVar;
                this.f165461c = z15;
                this.f165462d = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r8.F(r9, r0) == r1) goto L22;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r8, tq.e r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof qa.k.a.C4128a.C4129a
                    if (r0 == 0) goto L13
                    r0 = r9
                    qa.k$a$a$a r0 = (qa.k.a.C4128a.C4129a) r0
                    int r1 = r0.f165464e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f165464e = r1
                    goto L18
                L13:
                    qa.k$a$a$a r0 = new qa.k$a$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f165463d
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f165464e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    oq.u.b(r9)
                    goto L63
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f165465f
                    mu.h r8 = (mu.h) r8
                    oq.u.b(r9)
                    goto L57
                L3c:
                    oq.u.b(r9)
                    mu.h r9 = r7.f165459a
                    java.util.Set r8 = (java.util.Set) r8
                    oa.u r8 = r7.f165460b
                    boolean r2 = r7.f165461c
                    er.l r5 = r7.f165462d
                    r0.f165465f = r9
                    r0.f165464e = r4
                    java.lang.Object r8 = ta.a.e(r8, r4, r2, r5, r0)
                    if (r8 != r1) goto L54
                    goto L62
                L54:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L57:
                    r2 = 0
                    r0.f165465f = r2
                    r0.f165464e = r3
                    java.lang.Object r8 = r8.F(r9, r0)
                    if (r8 != r1) goto L63
                L62:
                    return r1
                L63:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: qa.k.a.C4128a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public a(mu.g gVar, u uVar, boolean z15, er.l lVar) {
            this.f165455a = gVar;
            this.f165456b = uVar;
            this.f165457c = z15;
            this.f165458d = lVar;
        }

        @Override // mu.g
        public Object a(mu.h hVar, tq.e eVar) {
            Object objA = this.f165455a.a(new C4128a(hVar, this.f165456b, this.f165457c, this.f165458d), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public static final <R> mu.g<R> a(u uVar, boolean z15, String[] strArr, er.l<? super ya.b, ? extends R> lVar) {
        return new a(mu.i.m(uVar.u().j((String[]) Arrays.copyOf(strArr, strArr.length), true)), uVar, z15, lVar);
    }
}
