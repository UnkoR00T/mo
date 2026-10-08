package ua0;

import cf0.AsyncDocumentToGenerate;
import fr.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import ta0.DesktopDocumentModel;
import vf0.Document;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lua0/r;", "Lxw/f;", "Lua0/r$a;", "", "Lta0/d;", "<init>", "()V", "Lcf0/c;", "Lvf0/d;", "f", "(Lcf0/c;)Lvf0/d;", "Lcf0/a;", "Lta0/e;", "e", "(Lcf0/a;)Lta0/e;", "params", "c", "(Lua0/r$a;)Ljava/util/List;", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements xw.f<Params, List<? extends DesktopDocumentModel>> {

    /* JADX INFO: renamed from: ua0.r$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lua0/r$a;", "", "", "Lvf0/a;", "savedDocuments", "Lcf0/b;", "documentsToGenerate", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Document> savedDocuments;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AsyncDocumentToGenerate> documentsToGenerate;

        public Params(List<Document> list, List<AsyncDocumentToGenerate> list2) {
            this.savedDocuments = list;
            this.documentsToGenerate = list2;
        }

        public final List<AsyncDocumentToGenerate> a() {
            return this.documentsToGenerate;
        }

        public final List<Document> b() {
            return this.savedDocuments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.savedDocuments, params.savedDocuments) && t.c(this.documentsToGenerate, params.documentsToGenerate);
        }

        public int hashCode() {
            return (this.savedDocuments.hashCode() * 31) + this.documentsToGenerate.hashCode();
        }

        public String toString() {
            return "Params(savedDocuments=" + this.savedDocuments + ", documentsToGenerate=" + this.documentsToGenerate + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f196728b;

        static {
            int[] iArr = new int[cf0.a.values().length];
            try {
                iArr[cf0.a.ALREADY_DOWNLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cf0.a.CREATING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cf0.a.NOT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cf0.a.TAKES_TOO_LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f196727a = iArr;
            int[] iArr2 = new int[cf0.c.values().length];
            try {
                iArr2[cf0.c.JUNIOR_STUDENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[cf0.c.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[cf0.c.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[cf0.c.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f196728b = iArr2;
        }
    }

    private final ta0.e e(cf0.a aVar) {
        int i15 = b.f196727a[aVar.ordinal()];
        if (i15 == 1) {
            return ta0.e.ALREADY_DOWNLOADED;
        }
        if (i15 == 2) {
            return ta0.e.ERROR;
        }
        if (i15 == 3) {
            return ta0.e.NOT_READY;
        }
        if (i15 == 4) {
            return ta0.e.TAKES_TOO_LONG;
        }
        throw new oq.p();
    }

    private final vf0.d f(cf0.c cVar) {
        int i15 = b.f196728b[cVar.ordinal()];
        if (i15 == 1) {
            return vf0.d.SCHOOL_CARD;
        }
        if (i15 == 2) {
            return vf0.d.DRIVING_LICENCE;
        }
        if (i15 == 3) {
            return vf0.d.FAMILY_CARD;
        }
        if (i15 == 4) {
            return vf0.d.UUT_CARD;
        }
        if (i15 == 5) {
            return vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD;
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<DesktopDocumentModel> b(Params params) {
        List<Document> listB = params.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (!((Document) obj).getIsChild()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(v.y(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((Document) obj2).getDocumentId(), obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Document document = (Document) entry.getValue();
            linkedHashMap2.put(key, new DesktopDocumentModel(document.getDocumentId(), document.getDocumentType(), ta0.e.NONE, null, 8, null));
        }
        Map mapW = v0.w(linkedHashMap2);
        for (AsyncDocumentToGenerate asyncDocumentToGenerate : params.a()) {
            String previousDocumentId = asyncDocumentToGenerate.getPreviousDocumentId();
            if (previousDocumentId != null) {
                DesktopDocumentModel desktopDocumentModel = (DesktopDocumentModel) mapW.get(previousDocumentId);
                if (desktopDocumentModel != null) {
                    mapW.put(previousDocumentId, DesktopDocumentModel.b(desktopDocumentModel, null, null, e(asyncDocumentToGenerate.getStatus()), asyncDocumentToGenerate.getDocumentId(), 3, null));
                } else {
                    DesktopDocumentModel desktopDocumentModel2 = (DesktopDocumentModel) mapW.get(asyncDocumentToGenerate.getDocumentId());
                    if (desktopDocumentModel2 != null) {
                        mapW.put(asyncDocumentToGenerate.getDocumentId(), DesktopDocumentModel.b(desktopDocumentModel2, null, null, e(asyncDocumentToGenerate.getStatus()), null, 11, null));
                    } else if (asyncDocumentToGenerate.getStatus() == cf0.a.CREATING_ERROR) {
                        mapW.put(asyncDocumentToGenerate.getDocumentId(), new DesktopDocumentModel(asyncDocumentToGenerate.getDocumentId(), f(asyncDocumentToGenerate.getDocumentType()), e(asyncDocumentToGenerate.getStatus()), null, 8, null));
                    }
                }
            } else {
                int i15 = b.f196727a[asyncDocumentToGenerate.getStatus().ordinal()];
                if (i15 == 1) {
                    DesktopDocumentModel desktopDocumentModel3 = (DesktopDocumentModel) mapW.get(asyncDocumentToGenerate.getDocumentId());
                    if (desktopDocumentModel3 != null) {
                        mapW.put(asyncDocumentToGenerate.getDocumentId(), DesktopDocumentModel.b(desktopDocumentModel3, null, null, e(asyncDocumentToGenerate.getStatus()), null, 11, null));
                    }
                } else {
                    if (i15 != 2 && i15 != 3 && i15 != 4) {
                        throw new oq.p();
                    }
                    mapW.put(asyncDocumentToGenerate.getDocumentId(), new DesktopDocumentModel(asyncDocumentToGenerate.getDocumentId(), f(asyncDocumentToGenerate.getDocumentType()), e(asyncDocumentToGenerate.getStatus()), null, 8, null));
                }
            }
        }
        return v.f1(mapW.values());
    }
}
