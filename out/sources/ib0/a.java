package ib0;

import dx.i;
import fr.t;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import oq.r;
import p071kotlin.Metadata;
import pq.v;
import tq.e;
import xf0.DrivingLicenceDataContainer;
import xf0.DrivingLicenceDocument;
import xf0.DrivingLicenceScope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lib0/a;", "", "Lib0/a$a;", "Lxf0/c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ldx/b$c;", "d", "()Ldx/b$c;", "params", "Ldx/i;", "Ldx/b;", "e", "(Lib0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ib0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lib0/a$a;", "Lgz/b$a;", "", "Lxf0/c;", "drivingLicences", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DrivingLicenceDocument> drivingLicences;

        public Params(List<DrivingLicenceDocument> list) {
            this.drivingLicences = list;
        }

        public final List<DrivingLicenceDocument> a() {
            return this.drivingLicences;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.drivingLicences, ((Params) other).drivingLicences);
        }

        public int hashCode() {
            return this.drivingLicences.hashCode();
        }

        public String toString() {
            return "Params(drivingLicences=" + this.drivingLicences + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f90712a;

        public b(Comparator comparator) {
            this.f90712a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            DrivingLicenceDataContainer drivingLicenceDataContainer;
            DrivingLicenceDataContainer drivingLicenceDataContainer2;
            Comparator comparator = this.f90712a;
            DrivingLicenceScope scopeData = ((DrivingLicenceDocument) t15).getScopeData();
            LocalDate releaseDate = null;
            LocalDate releaseDate2 = (scopeData == null || (drivingLicenceDataContainer2 = scopeData.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer2.getReleaseDate();
            DrivingLicenceScope scopeData2 = ((DrivingLicenceDocument) t16).getScopeData();
            if (scopeData2 != null && (drivingLicenceDataContainer = scopeData2.getDrivingLicenceDataContainer()) != null) {
                releaseDate = drivingLicenceDataContainer.getReleaseDate();
            }
            return comparator.compare(releaseDate2, releaseDate);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f90713a;

        public c(Comparator comparator) {
            this.f90713a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            DrivingLicenceDataContainer drivingLicenceDataContainer;
            DrivingLicenceDataContainer drivingLicenceDataContainer2;
            Comparator comparator = this.f90713a;
            DrivingLicenceScope scopeData = ((DrivingLicenceDocument) t15).getScopeData();
            LocalDate expiredDate = null;
            LocalDate expiredDate2 = (scopeData == null || (drivingLicenceDataContainer2 = scopeData.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer2.getExpiredDate();
            DrivingLicenceScope scopeData2 = ((DrivingLicenceDocument) t16).getScopeData();
            if (scopeData2 != null && (drivingLicenceDataContainer = scopeData2.getDrivingLicenceDataContainer()) != null) {
                expiredDate = drivingLicenceDataContainer.getExpiredDate();
            }
            return comparator.compare(expiredDate2, expiredDate);
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final dx.b.Business d() {
        return new dx.b.Business(hb0.a.INCOMPLETE_DATA, null, this.labelProvider.c(fb0.a.f60704b0), this.labelProvider.c(fb0.a.f60702a0), null, this.labelProvider.c(fb0.a.f60703b), null, 82, null);
    }

    public Object e(Params params, e<? super i<? extends dx.b, DrivingLicenceDocument>> eVar) {
        DrivingLicenceScope scopeData;
        DrivingLicenceDataContainer drivingLicenceDataContainer;
        List<DrivingLicenceDocument> listA = params.a();
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                if (((DrivingLicenceDocument) it.next()).getScopeData() != null) {
                    List<DrivingLicenceDocument> listA2 = params.a();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listA2) {
                        DrivingLicenceDocument drivingLicenceDocument = (DrivingLicenceDocument) obj;
                        if (drivingLicenceDocument.getDocumentStatus() != vf0.c.ACTIVE || (scopeData = drivingLicenceDocument.getScopeData()) == null || (drivingLicenceDataContainer = scopeData.getDrivingLicenceDataContainer()) == null || !drivingLicenceDataContainer.n()) {
                            arrayList2.add(obj);
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    r rVar = new r(arrayList, arrayList2);
                    List list = (List) rVar.a();
                    List list2 = (List) rVar.b();
                    DrivingLicenceDocument drivingLicenceDocument2 = (DrivingLicenceDocument) v.G0(list, new b(sq.a.h(sq.a.g())));
                    return (drivingLicenceDocument2 == null && (drivingLicenceDocument2 = (DrivingLicenceDocument) v.D0(list2, new c(sq.a.h(sq.a.g())))) == null) ? new i.Left(new dx.b.Generic(new NullPointerException("DrivingLicenceDocument cannot be null!"))) : new i.Right(drivingLicenceDocument2);
                }
            }
        }
        return new i.Left(d());
    }
}
