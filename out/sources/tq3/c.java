package tq3;

import dx.i;
import fr.p0;
import iq0.Announcement;
import iq0.Announcements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jq0.g;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ltq3/c;", "Lgz/b;", "Lgz/b$a$a;", "Liq0/c;", "Lsq3/a;", "announcementsDataSource", "Ljq0/g;", "BEGetWhatsNewUseCase", "Lsq3/b;", "displayedIdsDataSource", "Lpx/d;", "remoteLogger", "<init>", "(Lsq3/a;Ljq0/g;Lsq3/b;Lpx/d;)V", "g", "(Ltq/e;)Ljava/lang/Object;", "announcements", "f", "(Liq0/c;)Liq0/c;", "", "", "displayedIds", "Loq/i0;", "e", "(Liq0/c;Ljava/util/Set;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lsq3/a;", "b", "Ljq0/g;", "c", "Lsq3/b;", "d", "Lpx/d;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<gz.b.a.C1792a, Announcements> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sq3.a announcementsDataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g BEGetWhatsNewUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sq3.b displayedIdsDataSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f191688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f191689e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f191691g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191689e = obj;
            this.f191691g |= PKIFailureInfo.systemUnavail;
            return c.this.g(this);
        }
    }

    public c(sq3.a aVar, g gVar, sq3.b bVar, px.d dVar) {
        this.announcementsDataSource = aVar;
        this.BEGetWhatsNewUseCase = gVar;
        this.displayedIdsDataSource = bVar;
        this.remoteLogger = dVar;
    }

    private final void e(Announcements announcements, Set<Long> displayedIds) {
        List<Announcement> listA = announcements.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Announcement) it.next()).getId()));
        }
        sq3.b bVar = this.displayedIdsDataSource;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : displayedIds) {
            if (arrayList.contains(Long.valueOf(((Number) obj).longValue()))) {
                arrayList2.add(obj);
            }
        }
        bVar.a(v.k1(arrayList2));
    }

    private final Announcements f(Announcements announcements) {
        Set<Long> setB = this.displayedIdsDataSource.b();
        e(announcements, setB);
        List<Announcement> listA = announcements.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (!setB.contains(Long.valueOf(((Announcement) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        return new Announcements(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, iq0.c] */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, iq0.c] */
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
    public final Object g(tq.e<? super Announcements> eVar) throws Throwable {
        a aVar;
        p0 p0Var;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f191691g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f191691g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f191689e;
        Object objE = uq.b.e();
        int i16 = aVar.f191691g;
        if (i16 == 0) {
            u.b(obj);
            p0 p0Var2 = new p0();
            p0Var2.f66410a = new Announcements(v.n());
            g gVar = this.BEGetWhatsNewUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f191688d = p0Var2;
            aVar.f191691g = 1;
            Object objC = gVar.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
            p0Var = p0Var2;
            obj = objC;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (p0) aVar.f191688d;
            u.b(obj);
        }
        i iVar = (i) obj;
        if (iVar instanceof i.Left) {
            dx.b bVar = (dx.b) ((i.Left) iVar).b();
            this.remoteLogger.u6("Error fetching WhatsNew announcements, domain error is " + bVar, px.c.a(this));
        } else {
            if (!(iVar instanceof i.Right)) {
                throw new p();
            }
            ?? F = f((Announcements) ((i.Right) iVar).b());
            this.announcementsDataSource.a(F);
            p0Var.f66410a = F;
        }
        return p0Var.f66410a;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super Announcements> eVar) {
        Announcements announcements = this.announcementsDataSource.getAnnouncements();
        return announcements == null ? g(eVar) : announcements;
    }
}
