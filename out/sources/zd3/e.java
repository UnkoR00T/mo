package zd3;

import ae3.h;
import aw0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import mu.g;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import sv0.CollisionGroup;
import sv0.m;
import vq.j;
import yd3.StatementListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r*\b\u0012\u0004\u0012\u00020\u00100\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r*\b\u0012\u0004\u0012\u00020\u00130\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\r*\b\u0012\u0004\u0012\u00020\u00160\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010*¨\u0006,"}, d2 = {"Lzd3/e;", "Lv00/a;", "Lyd3/c;", "Lzd3/d;", "Lju/p0;", "scope", "Lae3/h;", "getFirstPageUserCollisionsUC", "Law0/w;", "getUserCollisionsNextPageUC", "<init>", "(Lju/p0;Lae3/h;Law0/w;)V", "Lsv0/m;", "", "k", "(Lsv0/m;)Ljava/util/List;", "Lsv0/g$b;", "j", "(Ljava/util/List;)Ljava/util/List;", "Lsv0/g;", "Lyd3/c$b;", "h", "Lsv0/j;", "i", "Lmu/g;", "Lyd3/g;", "c", "()Lmu/g;", "Lfy/b;", "pageIndex", "Ldx/i;", "Ldx/b;", "Lfy/a;", "e", "(Lfy/b;Ltq/e;)Ljava/lang/Object;", "b", "Lju/p0;", "f", "()Lju/p0;", "Lae3/h;", "d", "Law0/w;", "Lyd3/g;", "currentAdditionalData", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends v00.a<yd3.c> implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h getFirstPageUserCollisionsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w getUserCollisionsNextPageUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private StatementListData currentAdditionalData = new StatementListData(true, 7, null, 4, null);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f234411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f234412e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f234414g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f234412e = obj;
            this.f234414g |= PKIFailureInfo.systemUnavail;
            return e.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements g<StatementListData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f234415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f234416b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f234417a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f234418b;

            /* JADX INFO: renamed from: zd3.e$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6316a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f234419d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f234420e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f234421f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f234423h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f234424j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f234425k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f234426l;

                public C6316a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f234419d = obj;
                    this.f234420e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, e eVar) {
                this.f234417a = hVar;
                this.f234418b = eVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6316a c6316a;
                if (eVar instanceof C6316a) {
                    c6316a = (C6316a) eVar;
                    int i15 = c6316a.f234420e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6316a.f234420e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6316a = new C6316a(eVar);
                    }
                } else {
                    c6316a = new C6316a(eVar);
                }
                Object obj2 = c6316a.f234419d;
                Object objE = uq.b.e();
                int i16 = c6316a.f234420e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f234417a;
                    StatementListData statementListDataB = StatementListData.b(this.f234418b.currentAdditionalData, false, 0, (fy.c) obj, 3, null);
                    c6316a.f234421f = j.a(obj);
                    c6316a.f234423h = j.a(c6316a);
                    c6316a.f234424j = j.a(obj);
                    c6316a.f234425k = j.a(hVar);
                    c6316a.f234426l = 0;
                    c6316a.f234420e = 1;
                    if (hVar.F(statementListDataB, c6316a) == objE) {
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

        public b(g gVar, e eVar) {
            this.f234415a = gVar;
            this.f234416b = eVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super StatementListData> hVar, tq.e eVar) {
            Object objA = this.f234415a.a(new a(hVar, this.f234416b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public e(p0 p0Var, h hVar, w wVar) {
        this.scope = p0Var;
        this.getFirstPageUserCollisionsUC = hVar;
        this.getUserCollisionsNextPageUC = wVar;
    }

    private final List<yd3.c.PagingCollision> h(List<? extends sv0.g> list) {
        List<? extends sv0.g> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new yd3.c.PagingCollision((sv0.g) it.next()));
        }
        return arrayList;
    }

    private final List<yd3.c> i(List<CollisionGroup> list) {
        ArrayList arrayList = new ArrayList();
        for (CollisionGroup collisionGroup : list) {
            v.D(arrayList, v.L0(v.e(new yd3.c.GroupedHeader(collisionGroup.getDate())), h(collisionGroup.b())));
        }
        return arrayList;
    }

    private final List<yd3.c> j(List<sv0.g.Started> list) {
        yd3.c.C6075c c6075c = yd3.c.C6075c.f226587a;
        if (list.isEmpty()) {
            c6075c = null;
        }
        return v.L0(v.r(c6075c), h(list));
    }

    private final List<yd3.c> k(m mVar) {
        return v.L0(j(mVar.a()), i(mVar.c()));
    }

    @Override // zd3.d
    public g<StatementListData> c() {
        return new b(a(), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        if (r8 == r1) goto L38;
     */
    @Override // v00.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(fy.b r7, tq.e<? super dx.i<? extends dx.b, fy.Page<yd3.c>>> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd3.e.e(fy.b, tq.e):java.lang.Object");
    }

    @Override // v00.a
    /* JADX INFO: renamed from: f, reason: from getter */
    public p0 getScope() {
        return this.scope;
    }
}
