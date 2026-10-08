package wg1;

import ah1.ServiceSectionLists;
import ay.j;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mr.r;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.dashboard.data.model.ServiceEntryDto;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lwg1/f;", "Lbh1/c;", "Lcz/c;", "persistentStorageFactory", "Lay/j;", "jsonSerializer", "<init>", "(Lcz/c;Lay/j;)V", "Lah1/f;", "g", "(Ltq/e;)Ljava/lang/Object;", "", "jsonArray", "", "Lpl/gov/coi/mobywatel/feature/dashboard/data/model/ServiceEntryDto;", "f", "(Ljava/lang/String;)Ljava/util/List;", "a", "serviceSectionLists", "Loq/i0;", "b", "(Lah1/f;Ltq/e;)Ljava/lang/Object;", "Lay/j;", "Lcz/b;", "Loq/k;", "e", "()Lcz/b;", "persistentStorage", "c", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements bh1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f213251d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k persistentStorage;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f213255e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f213257g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213255e = obj;
            this.f213257g |= PKIFailureInfo.systemUnavail;
            return f.this.g(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f213260f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f213261g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f213263j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213261g = obj;
            this.f213263j |= PKIFailureInfo.systemUnavail;
            return f.this.b(null, this);
        }
    }

    public f(final cz.c cVar, j jVar) {
        this.jsonSerializer = jVar;
        this.persistentStorage = l.a(new er.a() { // from class: wg1.e
            @Override // er.a
            public final Object a() {
                return f.h(cVar);
            }
        });
    }

    private final cz.b e() {
        return (cz.b) this.persistentStorage.getValue();
    }

    private final List<ServiceEntryDto> f(String jsonArray) {
        if (jsonArray != null) {
            return (List) this.jsonSerializer.a(jsonArray, q0.h(List.class, r.INSTANCE.d(q0.n(ServiceEntryDto.class))));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:13:0x002d, B:27:0x006d, B:29:0x0077, B:30:0x0086, B:32:0x008c, B:34:0x009d, B:36:0x00a3, B:37:0x00b2, B:39:0x00b8, B:41:0x00c9, B:17:0x0039, B:23:0x0053, B:20:0x0040), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: Exception -> 0x00cf, LOOP:0: B:30:0x0086->B:32:0x008c, LOOP_END, TryCatch #0 {Exception -> 0x00cf, blocks: (B:13:0x002d, B:27:0x006d, B:29:0x0077, B:30:0x0086, B:32:0x008c, B:34:0x009d, B:36:0x00a3, B:37:0x00b2, B:39:0x00b8, B:41:0x00c9, B:17:0x0039, B:23:0x0053, B:20:0x0040), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3 A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:13:0x002d, B:27:0x006d, B:29:0x0077, B:30:0x0086, B:32:0x008c, B:34:0x009d, B:36:0x00a3, B:37:0x00b2, B:39:0x00b8, B:41:0x00c9, B:17:0x0039, B:23:0x0053, B:20:0x0040), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[Catch: Exception -> 0x00cf, LOOP:1: B:37:0x00b2->B:39:0x00b8, LOOP_END, TryCatch #0 {Exception -> 0x00cf, blocks: (B:13:0x002d, B:27:0x006d, B:29:0x0077, B:30:0x0086, B:32:0x008c, B:34:0x009d, B:36:0x00a3, B:37:0x00b2, B:39:0x00b8, B:41:0x00c9, B:17:0x0039, B:23:0x0053, B:20:0x0040), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(tq.e<? super ServiceSectionLists> eVar) throws Throwable {
        b bVar;
        String str;
        List<ServiceEntryDto> listF;
        ArrayList arrayList;
        List<ServiceEntryDto> listF2;
        ArrayList arrayList2;
        Iterator<T> it;
        Iterator<T> it4;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f213257g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f213257g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objJ = bVar.f213255e;
        Object objE = uq.b.e();
        int i16 = bVar.f213257g;
        try {
            if (i16 == 0) {
                u.b(objJ);
                cz.b bVarE = e();
                String strB = cz.b.a.b("SHARED_PREFERENCES_USER_SERVICE_LIST");
                bVar.f213257g = 1;
                objJ = bVarE.j(strB, bVar);
                if (objJ == objE) {
                }
                return objE;
            }
            if (i16 == 1) {
                u.b(objJ);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) bVar.f213254d;
                u.b(objJ);
            }
            String str2 = (String) objJ;
            listF = f(str);
            if (listF != null) {
                List<ServiceEntryDto> list = listF;
                arrayList = new ArrayList(v.y(list, 10));
                it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(vg1.a.f206701a.a((ServiceEntryDto) it4.next()));
                }
            } else {
                arrayList = null;
            }
            listF2 = f(str2);
            if (listF2 != null) {
                List<ServiceEntryDto> list2 = listF2;
                arrayList2 = new ArrayList(v.y(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vg1.a.f206701a.a((ServiceEntryDto) it.next()));
                }
            } else {
                arrayList2 = null;
            }
            return new ServiceSectionLists(arrayList, arrayList2);
            String str3 = (String) objJ;
            cz.b bVarE2 = e();
            String strB2 = cz.b.a.b("SHARED_PREFERENCES_OTHER_SERVICE_LIST");
            bVar.f213254d = str3;
            bVar.f213257g = 2;
            Object objJ2 = bVarE2.j(strB2, bVar);
            if (objJ2 != objE) {
                str = str3;
                objJ = objJ2;
                String str4 = (String) objJ;
                listF = f(str);
                if (listF != null) {
                    List<ServiceEntryDto> list3 = listF;
                    arrayList = new ArrayList(v.y(list3, 10));
                    it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(vg1.a.f206701a.a((ServiceEntryDto) it4.next()));
                    }
                } else {
                    arrayList = null;
                }
                listF2 = f(str4);
                if (listF2 != null) {
                    List<ServiceEntryDto> list4 = listF2;
                    arrayList2 = new ArrayList(v.y(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(vg1.a.f206701a.a((ServiceEntryDto) it.next()));
                    }
                } else {
                    arrayList2 = null;
                }
                return new ServiceSectionLists(arrayList, arrayList2);
            }
            return objE;
        } catch (Exception unused) {
            px.f.e(px.f.f163100a, "Invalid deserialization of ServiceListModel", null, px.c.a(this), 2, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b h(cz.c cVar) {
        return cVar.a("shared_prefs_service_order", cz.d.PLAIN);
    }

    @Override // bh1.c
    public Object a(tq.e<? super ServiceSectionLists> eVar) {
        return g(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0183, code lost:
    
        if (r4.k(r0, r1) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:
    
        if (r5.e(r0, r3, r1) == r2) goto L58;
     */
    @Override // bh1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(ah1.ServiceSectionLists r15, tq.e<? super oq.i0> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.f.b(ah1.f, tq.e):java.lang.Object");
    }
}
