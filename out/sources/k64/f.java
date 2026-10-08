package k64;

import g64.GlobalSearchDocumentResult;
import g64.GlobalSearchEntry;
import g64.GlobalSearchResult;
import iq0.BESearchConfigSectionItem;
import iq0.BESearchSections;
import iq0.SearchTags;
import iq0.SearchTagsForAppMenuType;
import iq0.SearchTagsForDocumentType;
import iq0.SearchTagsForServiceType;
import iq0.SearchTagsWithLanguage;
import iq0.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.l0;
import ju.p0;
import n64.ChecksumEntity;
import n64.SearchEntryEntity;
import n64.SearchSectionEntity;
import n64.SearchTagEntity;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+0\u000e2\u0006\u0010*\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b,\u0010-J\u001c\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020.0\u000eH\u0096@¢\u0006\u0004\b/\u0010\u0012J\u0010\u00100\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b0\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105¨\u00066"}, d2 = {"Lk64/f;", "Lr64/a;", "Lm64/k;", "searchTagsDao", "Lm64/f;", "searchSectionsDao", "Lm64/a;", "searchEntriesDao", "Ljx/g;", "systemInfo", "Lez/a;", "currentTimeProvider", "<init>", "(Lm64/k;Lm64/f;Lm64/a;Ljx/g;Lez/a;)V", "Ldx/i;", "Ldx/b;", "", "d", "(Ltq/e;)Ljava/lang/Object;", "Liq0/n;", "e", "sections", "Loq/i0;", "g", "(Liq0/n;Ltq/e;)Ljava/lang/Object;", "Lg64/c;", "mainType", "Lg64/d;", "entryType", "h", "(Lg64/c;Lg64/d;Ltq/e;)Ljava/lang/Object;", "", "limit", "Lmu/g;", "", "Lg64/b;", "c", "(I)Lmu/g;", "Liq0/b0;", "searchTags", "i", "(Liq0/b0;Ltq/e;)Ljava/lang/Object;", "query", "Lg64/e;", "f", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "b", "a", "Lm64/k;", "Lm64/f;", "Lm64/a;", "Ljx/g;", "Lez/a;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements r64.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m64.k searchTagsDao;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m64.f searchSectionsDao;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m64.a searchEntriesDao;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jx.g systemInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108740e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            if (r6.a(r5) == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f108740e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                oq.u.b(r6)
                goto L55
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                oq.u.b(r6)
                goto L46
            L21:
                oq.u.b(r6)
                goto L37
            L25:
                oq.u.b(r6)
                k64.f r6 = k64.f.this
                m64.k r6 = k64.f.m(r6)
                r5.f108740e = r4
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L37
                goto L54
            L37:
                k64.f r6 = k64.f.this
                m64.f r6 = k64.f.l(r6)
                r5.f108740e = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L46
                goto L54
            L46:
                k64.f r6 = k64.f.this
                m64.a r6 = k64.f.k(r6)
                r5.f108740e = r2
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L55
            L54:
                return r0
            L55:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: k64.f.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new a(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f108742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f108744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f108745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f108746h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f108747j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f108748k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f108749l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f108750m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f108751n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f108753q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108751n = obj;
            this.f108753q |= PKIFailureInfo.systemUnavail;
            return f.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lg64/e;", "<anonymous>", "(Lju/p0;)Lg64/e;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super GlobalSearchResult>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f108755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f108756g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f108757h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f108759k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f108759k = str;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:27:0x00cc A[LOOP:0: B:25:0x00c6->B:27:0x00cc, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:31:0x00ef A[LOOP:1: B:29:0x00e9->B:31:0x00ef, LOOP_END] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String str;
            List list;
            String str2;
            List list2;
            Object objK;
            List list3;
            ArrayList arrayList;
            Iterator it;
            ArrayList arrayList2;
            Iterator it4;
            Object objE = uq.b.e();
            int i15 = this.f108757h;
            if (i15 == 0) {
                u.b(obj);
                String upperCase = f.this.systemInfo.n().toUpperCase(Locale.ROOT);
                m64.k kVar = f.this.searchTagsDao;
                String str3 = this.f108759k;
                a0 a0VarValueOf = a0.valueOf(upperCase);
                o64.c cVar = o64.c.SERVICE;
                this.f108754e = upperCase;
                this.f108757h = 1;
                Object objK2 = kVar.k(str3, a0VarValueOf, cVar, this);
                if (objK2 != objE) {
                    str = upperCase;
                    obj = objK2;
                }
                return objE;
            }
            if (i15 == 1) {
                str = (String) this.f108754e;
                u.b(obj);
            } else {
                if (i15 == 2) {
                    list = (List) this.f108755f;
                    str2 = (String) this.f108754e;
                    u.b(obj);
                    list2 = (List) obj;
                    m64.k kVar2 = f.this.searchTagsDao;
                    String str4 = this.f108759k;
                    a0 a0VarValueOf2 = a0.valueOf(str2);
                    o64.c cVar2 = o64.c.APP_MENU_ITEM;
                    this.f108754e = vq.j.a(str2);
                    this.f108755f = list;
                    this.f108756g = list2;
                    this.f108757h = 3;
                    objK = kVar2.k(str4, a0VarValueOf2, cVar2, this);
                    if (objK != objE) {
                        list3 = list2;
                        obj = objK;
                    }
                    return objE;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list3 = (List) this.f108756g;
                list = (List) this.f108755f;
                u.b(obj);
            }
            List list4 = (List) obj;
            List list5 = list;
            arrayList = new ArrayList(v.y(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(((GlobalSearchDocumentResult) it.next()).getType());
            }
            List list6 = list4;
            arrayList2 = new ArrayList(v.y(list6, 10));
            it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((GlobalSearchDocumentResult) it4.next()).getType());
            }
            return new GlobalSearchResult(arrayList, list3, arrayList2);
            List list7 = (List) obj;
            m64.k kVar3 = f.this.searchTagsDao;
            String str5 = this.f108759k;
            a0 a0VarValueOf3 = a0.valueOf(str);
            o64.c cVar3 = o64.c.DOCUMENT;
            this.f108754e = str;
            this.f108755f = list7;
            this.f108757h = 2;
            Object objK3 = kVar3.k(str5, a0VarValueOf3, cVar3, this);
            if (objK3 != objE) {
                String str6 = str;
                list = list7;
                obj = objK3;
                str2 = str6;
                list2 = (List) obj;
                m64.k kVar4 = f.this.searchTagsDao;
                String str7 = this.f108759k;
                a0 a0VarValueOf4 = a0.valueOf(str2);
                o64.c cVar4 = o64.c.APP_MENU_ITEM;
                this.f108754e = vq.j.a(str2);
                this.f108755f = list;
                this.f108756g = list2;
                this.f108757h = 3;
                objK = kVar4.k(str7, a0VarValueOf4, cVar4, this);
                if (objK != objE) {
                    list3 = list2;
                    obj = objK;
                    List list8 = (List) obj;
                    List list9 = list;
                    arrayList = new ArrayList(v.y(list9, 10));
                    it = list9.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((GlobalSearchDocumentResult) it.next()).getType());
                    }
                    List list10 = list8;
                    arrayList2 = new ArrayList(v.y(list10, 10));
                    it4 = list10.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((GlobalSearchDocumentResult) it4.next()).getType());
                    }
                    return new GlobalSearchResult(arrayList, list3, arrayList2);
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super GlobalSearchResult> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new c(this.f108759k, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f108760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f108762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f108763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f108764h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f108765j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f108766k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f108767l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f108768m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f108770p;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108768m = obj;
            this.f108770p |= PKIFailureInfo.systemUnavail;
            return f.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super String>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108771e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108771e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            m64.k kVar = f.this.searchTagsDao;
            this.f108771e = 1;
            Object objD = kVar.d(this);
            return objD == objE ? objE : objD;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super String> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new e(eVar);
        }
    }

    /* JADX INFO: renamed from: k64.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2589f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f108773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f108775f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f108776g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f108777h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f108778j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f108779k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f108780l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f108781m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f108783p;

        C2589f(tq.e<? super C2589f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108781m = obj;
            this.f108783p |= PKIFailureInfo.systemUnavail;
            return f.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Liq0/n;", "<anonymous>", "(Lju/p0;)Liq0/n;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super BESearchSections>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108784e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108784e;
            if (i15 == 0) {
                u.b(obj);
                m64.f fVar = f.this.searchSectionsDao;
                this.f108784e = 1;
                obj = fVar.b(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            List list = (List) obj;
            ArrayList<SearchSectionEntity> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((SearchSectionEntity) obj2).getSection() == o64.b.NEWS) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
            for (SearchSectionEntity searchSectionEntity : arrayList) {
                arrayList2.add(new BESearchConfigSectionItem(searchSectionEntity.getOrder(), searchSectionEntity.getServiceType(), searchSectionEntity.getDocumentType(), searchSectionEntity.getSubType()));
            }
            ArrayList<SearchSectionEntity> arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (((SearchSectionEntity) obj3).getSection() == o64.b.POPULAR) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(v.y(arrayList3, 10));
            for (SearchSectionEntity searchSectionEntity2 : arrayList3) {
                arrayList4.add(new BESearchConfigSectionItem(searchSectionEntity2.getOrder(), searchSectionEntity2.getServiceType(), searchSectionEntity2.getDocumentType(), searchSectionEntity2.getSubType()));
            }
            return new BESearchSections(arrayList2, arrayList4);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super BESearchSections> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new g(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f108786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f108788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f108789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f108790h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f108791j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f108792k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f108793l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f108794m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f108796p;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108794m = obj;
            this.f108796p |= PKIFailureInfo.systemUnavail;
            return f.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108797e;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108797e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            m64.k kVar = f.this.searchTagsDao;
            this.f108797e = 1;
            Object objB = kVar.b(this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmu/h;", "", "Lg64/b;", "", "throwable", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<mu.h<? super List<? extends GlobalSearchEntry>>, Throwable, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108800f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Throwable th4 = (Throwable) this.f108800f;
            uq.b.e();
            if (this.f108799e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            px.f.e(px.f.f163100a, "monitorLastOpenedSearchEntries error", th4, null, 4, null);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super List<GlobalSearchEntry>> hVar, Throwable th4, tq.e<? super i0> eVar) {
            j jVar = new j(eVar);
            jVar.f108800f = th4;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class k implements mu.g<List<? extends GlobalSearchEntry>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f108801a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f108802a;

            /* JADX INFO: renamed from: k64.f$k$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2590a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f108803d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f108804e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f108805f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f108807h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f108808j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f108809k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f108810l;

                public C2590a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f108803d = obj;
                    this.f108804e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f108802a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2590a c2590a;
                if (eVar instanceof C2590a) {
                    c2590a = (C2590a) eVar;
                    int i15 = c2590a.f108804e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2590a.f108804e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2590a = new C2590a(eVar);
                    }
                } else {
                    c2590a = new C2590a(eVar);
                }
                Object obj2 = c2590a.f108803d;
                Object objE = uq.b.e();
                int i16 = c2590a.f108804e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f108802a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(i64.a.a((SearchEntryEntity) it.next()));
                    }
                    c2590a.f108805f = vq.j.a(obj);
                    c2590a.f108807h = vq.j.a(c2590a);
                    c2590a.f108808j = vq.j.a(obj);
                    c2590a.f108809k = vq.j.a(hVar);
                    c2590a.f108810l = 0;
                    c2590a.f108804e = 1;
                    if (hVar.F(arrayList, c2590a) == objE) {
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

        public k(mu.g gVar) {
            this.f108801a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends GlobalSearchEntry>> hVar, tq.e eVar) {
            Object objA = this.f108801a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f108811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f108813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f108814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f108815h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f108816j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f108817k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f108818l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f108819m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f108820n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f108821p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f108823r;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108821p = obj;
            this.f108823r |= PKIFailureInfo.systemUnavail;
            return f.this.h(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108824e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f108825f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g64.d f108826g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g64.c f108827h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f108828j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(g64.d dVar, g64.c cVar, f fVar, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f108826g = dVar;
            this.f108827h = cVar;
            this.f108828j = fVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108825f;
            if (i15 == 0) {
                u.b(obj);
                SearchEntryEntity searchEntryEntity = new SearchEntryEntity(i64.a.d(this.f108826g), i64.a.e(this.f108827h), this.f108828j.currentTimeProvider.d().getEpochSecond());
                m64.a aVar = this.f108828j.searchEntriesDao;
                this.f108824e = vq.j.a(searchEntryEntity);
                this.f108825f = 1;
                if (aVar.d(searchEntryEntity, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((m) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new m(this.f108826g, this.f108827h, this.f108828j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f108829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f108831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f108832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f108833h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f108834j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f108835k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f108836l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f108837m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f108838n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f108840q;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108838n = obj;
            this.f108840q |= PKIFailureInfo.systemUnavail;
            return f.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f108842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f108843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BESearchSections f108844h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f108845j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(BESearchSections bESearchSections, f fVar, tq.e<? super o> eVar) {
            super(2, eVar);
            this.f108844h = bESearchSections;
            this.f108845j = fVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108843g;
            if (i15 == 0) {
                u.b(obj);
                List<BESearchConfigSectionItem> listB = this.f108844h.b();
                ArrayList arrayList = new ArrayList(v.y(listB, 10));
                for (BESearchConfigSectionItem bESearchConfigSectionItem : listB) {
                    arrayList.add(new SearchSectionEntity(0L, bESearchConfigSectionItem.getOrder(), o64.b.POPULAR, bESearchConfigSectionItem.getServiceType(), bESearchConfigSectionItem.getDocumentType(), bESearchConfigSectionItem.getSubType(), 1, null));
                }
                List<BESearchConfigSectionItem> listA = this.f108844h.a();
                ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
                for (BESearchConfigSectionItem bESearchConfigSectionItem2 : listA) {
                    arrayList2.add(new SearchSectionEntity(0L, bESearchConfigSectionItem2.getOrder(), o64.b.NEWS, bESearchConfigSectionItem2.getServiceType(), bESearchConfigSectionItem2.getDocumentType(), bESearchConfigSectionItem2.getSubType(), 1, null));
                }
                m64.f fVar = this.f108845j.searchSectionsDao;
                List<SearchSectionEntity> listL0 = v.L0(arrayList, arrayList2);
                this.f108841e = vq.j.a(arrayList);
                this.f108842f = vq.j.a(arrayList2);
                this.f108843g = 1;
                if (fVar.c(listL0, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((o) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new o(this.f108844h, this.f108845j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f108846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f108848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f108849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f108850h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f108851j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f108852k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f108853l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f108854m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f108855n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f108857q;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f108855n = obj;
            this.f108857q |= PKIFailureInfo.systemUnavail;
            return f.this.i(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f108858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f108859f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f108860g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ SearchTags f108861h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f108862j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(SearchTags searchTags, f fVar, tq.e<? super q> eVar) {
            super(2, eVar);
            this.f108861h = searchTags;
            this.f108862j = fVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108860g;
            if (i15 == 0) {
                u.b(obj);
                ChecksumEntity checksumEntity = new ChecksumEntity(this.f108861h.getChecksum());
                ArrayList arrayList = new ArrayList();
                for (SearchTagsForServiceType searchTagsForServiceType : this.f108861h.d()) {
                    for (SearchTagsWithLanguage searchTagsWithLanguage : searchTagsForServiceType.b()) {
                        Iterator<T> it = searchTagsWithLanguage.b().iterator();
                        while (it.hasNext()) {
                            arrayList.add(new SearchTagEntity(0L, (String) it.next(), searchTagsWithLanguage.getLanguage(), searchTagsForServiceType.getServiceType(), o64.c.SERVICE, null, 1, null));
                        }
                    }
                }
                for (SearchTagsForDocumentType searchTagsForDocumentType : this.f108861h.c()) {
                    for (SearchTagsWithLanguage searchTagsWithLanguage2 : searchTagsForDocumentType.c()) {
                        Iterator<T> it4 = searchTagsWithLanguage2.b().iterator();
                        while (it4.hasNext()) {
                            arrayList.add(new SearchTagEntity(0L, (String) it4.next(), searchTagsWithLanguage2.getLanguage(), searchTagsForDocumentType.getDocumentType(), o64.c.DOCUMENT, searchTagsForDocumentType.getSubType(), 1, null));
                        }
                    }
                }
                for (SearchTagsForAppMenuType searchTagsForAppMenuType : this.f108861h.b()) {
                    for (SearchTagsWithLanguage searchTagsWithLanguage3 : searchTagsForAppMenuType.a()) {
                        Iterator<T> it5 = searchTagsWithLanguage3.b().iterator();
                        while (it5.hasNext()) {
                            arrayList.add(new SearchTagEntity(0L, (String) it5.next(), searchTagsWithLanguage3.getLanguage(), searchTagsForAppMenuType.getType(), o64.c.APP_MENU_ITEM, null, 1, null));
                        }
                    }
                }
                m64.k kVar = this.f108862j.searchTagsDao;
                this.f108858e = vq.j.a(checksumEntity);
                this.f108859f = vq.j.a(arrayList);
                this.f108860g = 1;
                if (kVar.l(checksumEntity, arrayList, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((q) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new q(this.f108861h, this.f108862j, eVar);
        }
    }

    public f(m64.k kVar, m64.f fVar, m64.a aVar, jx.g gVar, ez.a aVar2) {
        this.searchTagsDao = kVar;
        this.searchSectionsDao = fVar;
        this.searchEntriesDao = aVar;
        this.systemInfo = gVar;
        this.currentTimeProvider = aVar2;
    }

    @Override // r64.a
    public Object a(tq.e<? super i0> eVar) {
        Object objG = ju.i.g(g1.b(), new a(null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [k64.f$h, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // r64.a
    public Object b(tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        ?? hVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof h) {
            h hVar2 = (h) eVar;
            int i15 = hVar2.f108796p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar2.f108796p = i15 - PKIFailureInfo.systemUnavail;
                hVar = hVar2;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f108794m;
        Object objE = uq.b.e();
        int i16 = hVar.f108796p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        i iVar = new i(null);
                        hVar.f108791j = jVarA;
                        hVar.f108792k = vq.j.a(aVar);
                        hVar.f108793l = vq.j.a(aVar);
                        hVar.f108786d = 0;
                        hVar.f108787e = 0;
                        hVar.f108788f = 0;
                        hVar.f108789g = 0;
                        hVar.f108790h = 0;
                        hVar.f108796p = 1;
                        Object objG = ju.i.g(l0VarB, iVar, hVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        hVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(hVar));
                        dx.i iVarA = hVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(vq.b.a(((Boolean) obj).booleanValue()));
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // r64.a
    public mu.g<List<GlobalSearchEntry>> c(int limit) {
        return mu.i.f(new k(mu.i.p(this.searchEntriesDao.c(limit))), new j(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [k64.f$d, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // r64.a
    public Object d(tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        ?? dVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof d) {
            d dVar2 = (d) eVar;
            int i15 = dVar2.f108770p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f108770p = i15 - PKIFailureInfo.systemUnavail;
                dVar = dVar2;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f108768m;
        Object objE = uq.b.e();
        int i16 = dVar.f108770p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        e eVar2 = new e(null);
                        dVar.f108765j = jVarA;
                        dVar.f108766k = vq.j.a(aVar);
                        dVar.f108767l = vq.j.a(aVar);
                        dVar.f108760d = 0;
                        dVar.f108761e = 0;
                        dVar.f108762f = 0;
                        dVar.f108763g = 0;
                        dVar.f108764h = 0;
                        dVar.f108770p = 1;
                        Object objG = ju.i.g(l0VarB, eVar2, dVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        dVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(dVar));
                        dx.i iVarA = dVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((String) obj);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [k64.f$f, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // r64.a
    public Object e(tq.e<? super dx.i<? extends dx.b, BESearchSections>> eVar) throws Throwable {
        ?? c2589f;
        Object objB;
        ex.c e15;
        if (eVar instanceof C2589f) {
            C2589f c2589f2 = (C2589f) eVar;
            int i15 = c2589f2.f108783p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2589f2.f108783p = i15 - PKIFailureInfo.systemUnavail;
                c2589f = c2589f2;
            } else {
                c2589f = new C2589f(eVar);
            }
        } else {
            c2589f = new C2589f(eVar);
        }
        Object obj = c2589f.f108781m;
        Object objE = uq.b.e();
        int i16 = c2589f.f108783p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        g gVar = new g(null);
                        c2589f.f108778j = jVarA;
                        c2589f.f108779k = vq.j.a(aVar);
                        c2589f.f108780l = vq.j.a(aVar);
                        c2589f.f108773d = 0;
                        c2589f.f108774e = 0;
                        c2589f.f108775f = 0;
                        c2589f.f108776g = 0;
                        c2589f.f108777h = 0;
                        c2589f.f108783p = 1;
                        Object objG = ju.i.g(l0VarB, gVar, c2589f);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        c2589f = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(c2589f));
                        dx.i iVarA = c2589f.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((BESearchSections) obj);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // r64.a
    public Object f(String str, tq.e<? super dx.i<? extends dx.b, GlobalSearchResult>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f108753q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f108753q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f108751n;
        Object objE = uq.b.e();
        int i16 = bVar.f108753q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        c cVar = new c(str, null);
                        bVar.f108742d = vq.j.a(str);
                        bVar.f108743e = jVarA;
                        bVar.f108744f = vq.j.a(aVar);
                        bVar.f108745g = vq.j.a(aVar);
                        bVar.f108746h = 0;
                        bVar.f108747j = 0;
                        bVar.f108748k = 0;
                        bVar.f108749l = 0;
                        bVar.f108750m = 0;
                        bVar.f108753q = 1;
                        Object objG = ju.i.g(l0VarB, cVar, bVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((GlobalSearchResult) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [iq0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // r64.a
    public Object g(BESearchSections bESearchSections, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        n nVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i15 = nVar.f108840q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f108840q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(eVar);
            }
        } else {
            nVar = new n(eVar);
        }
        Object obj = nVar.f108838n;
        Object objE = uq.b.e();
        int i16 = nVar.f108840q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        o oVar = new o(bESearchSections, this, null);
                        nVar.f108829d = vq.j.a(bESearchSections);
                        nVar.f108830e = jVarA;
                        nVar.f108831f = vq.j.a(aVar);
                        nVar.f108832g = vq.j.a(aVar);
                        nVar.f108833h = 0;
                        nVar.f108834j = 0;
                        nVar.f108835k = 0;
                        nVar.f108836l = 0;
                        nVar.f108837m = 0;
                        nVar.f108840q = 1;
                        if (ju.i.g(l0VarB, oVar, nVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        bESearchSections = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bESearchSections));
                        dx.i iVarA = bESearchSections.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [g64.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // r64.a
    public Object h(g64.c cVar, g64.d dVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        l lVar;
        Object objB;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f108823r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f108823r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object obj = lVar.f108821p;
        Object objE = uq.b.e();
        int i16 = lVar.f108823r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        m mVar = new m(dVar, cVar, this, null);
                        lVar.f108811d = vq.j.a(cVar);
                        lVar.f108812e = vq.j.a(dVar);
                        lVar.f108813f = jVarA;
                        lVar.f108814g = vq.j.a(aVar);
                        lVar.f108815h = vq.j.a(aVar);
                        lVar.f108816j = 0;
                        lVar.f108817k = 0;
                        lVar.f108818l = 0;
                        lVar.f108819m = 0;
                        lVar.f108820n = 0;
                        lVar.f108823r = 1;
                        if (ju.i.g(l0VarB, mVar, lVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        cVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(cVar));
                        dx.i iVarA = cVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [iq0.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // r64.a
    public Object i(SearchTags searchTags, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        p pVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof p) {
            pVar = (p) eVar;
            int i15 = pVar.f108857q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                pVar.f108857q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                pVar = new p(eVar);
            }
        } else {
            pVar = new p(eVar);
        }
        Object obj = pVar.f108855n;
        Object objE = uq.b.e();
        int i16 = pVar.f108857q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        q qVar = new q(searchTags, this, null);
                        pVar.f108846d = vq.j.a(searchTags);
                        pVar.f108847e = jVarA;
                        pVar.f108848f = vq.j.a(aVar);
                        pVar.f108849g = vq.j.a(aVar);
                        pVar.f108850h = 0;
                        pVar.f108851j = 0;
                        pVar.f108852k = 0;
                        pVar.f108853l = 0;
                        pVar.f108854m = 0;
                        pVar.f108857q = 1;
                        if (ju.i.g(l0VarB, qVar, pVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        searchTags = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(searchTags));
                        dx.i iVarA = searchTags.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
