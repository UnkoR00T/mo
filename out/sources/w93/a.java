package w93;

import android.graphics.Bitmap;
import dx.i;
import ez.e;
import fr.t;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import v93.Contact;
import v93.CountryDetails;
import v93.CountryDetailsFormatted;
import v93.InfoItem;
import v93.Profile;
import v93.Warning;
import v93.f;
import v93.h;
import v93.j;
import v93.n;
import x93.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u001f*\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030#2\u0006\u0010\"\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.¨\u0006/"}, d2 = {"Lw93/a;", "", "Lw93/a$a;", "Lv93/e;", "Lx93/d;", "interactor", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "Lb00/c;", "imageConverter", "Lu10/d;", "markdownParser", "<init>", "(Lx93/d;Lez/e;Lmx/c;Lb00/c;Lu10/d;)V", "Lv93/d;", "", "Lv93/g;", "f", "(Lv93/d;)Ljava/util/List;", "Lv93/j;", "Lv93/h;", "g", "(Lv93/j;)Lv93/h;", "Lv93/l;", "Lv93/e$a;", "h", "(Lv93/l;)Lv93/e$a;", "Ljava/time/LocalDate;", "date", "", "d", "(Lez/e;Ljava/time/LocalDate;)Ljava/lang/String;", "params", "Ldx/i;", "Ldx/b;", "e", "(Lw93/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lx93/d;", "b", "Lez/e;", "c", "Lmx/c;", "Lb00/c;", "Lu10/d;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d interactor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u10.d markdownParser;

    /* JADX INFO: renamed from: w93.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lw93/a$a;", "Lgz/b$a;", "", "isoCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String isoCode;

        public Params(String str) {
            this.isoCode = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIsoCode() {
            return this.isoCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.isoCode, ((Params) other).isoCode);
        }

        public int hashCode() {
            return this.isoCode.hashCode();
        }

        public String toString() {
            return "Params(isoCode=" + this.isoCode + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f211448a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.SAFETY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.TRAVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.LAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f211448a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f211452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f211453h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f211454j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f211455k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f211456l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f211457m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f211459p;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211457m = obj;
            this.f211459p |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    public a(d dVar, e eVar, mx.c cVar, b00.c cVar2, u10.d dVar2) {
        this.interactor = dVar;
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
        this.imageConverter = cVar2;
        this.markdownParser = dVar2;
    }

    private final String d(e eVar, LocalDate localDate) {
        return eVar.d(new fz.b.LocalDate(localDate), fz.c.DOTTED);
    }

    private final List<InfoItem> f(CountryDetails countryDetails) {
        List<Profile> listG = countryDetails.g();
        ArrayList arrayList = new ArrayList(v.y(listG, 10));
        for (Profile profile : listG) {
            arrayList.add(new InfoItem(g(profile.getType()), profile.getTitle(), new f.Profile(profile)));
        }
        Map<v93.b, List<Contact>> mapA = countryDetails.a();
        if (mapA.isEmpty()) {
            mapA = null;
        }
        return v.L0(arrayList, v.r(mapA != null ? new InfoItem(h.EMERGENCY_CONTACTS, this.labelProvider.c(r93.a.f172507q0).getText(), new f.Contact(countryDetails.a())) : null));
    }

    private final h g(j jVar) {
        int i15 = b.f211448a[jVar.ordinal()];
        if (i15 == 1) {
            return h.SECURITY;
        }
        if (i15 == 2) {
            return h.TRAVELLING;
        }
        if (i15 != 3) {
            return i15 != 4 ? h.UNKNOWN : h.LAW_AND_CUSTOMS;
        }
        return h.HEALTH;
    }

    private final CountryDetailsFormatted.WarningFormatted h(Warning warning) {
        return new CountryDetailsFormatted.WarningFormatted(warning.getType(), this.markdownParser.parse(warning.getDescription()), warning.getWarningLevel());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0112  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:46:0x0141  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4 A[LOOP:2: B:66:0x019e->B:68:0x01a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x016c A[SYNTHETIC] */
    public Object e(Params params, tq.e<? super i<? extends dx.b, CountryDetailsFormatted>> eVar) throws Throwable {
        c cVar;
        Params params2;
        i iVar;
        CountryDetails countryDetails;
        Params params3;
        CountryDetails countryDetails2;
        int i15;
        int i16;
        Bitmap bitmap;
        int i17;
        int i18;
        String map;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Object objB;
        Bitmap bitmap4;
        Iterator<T> it;
        Object next;
        Warning warning;
        CountryDetailsFormatted.WarningFormatted warningFormattedH;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it4;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i19 = cVar.f211459p;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f211459p = i19 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB2 = cVar.f211457m;
        Object objE = uq.b.e();
        int i25 = cVar.f211459p;
        if (i25 == 0) {
            u.b(objB2);
            d dVar = this.interactor;
            String isoCode = params.getIsoCode();
            cVar.f211449d = vq.j.a(params);
            cVar.f211459p = 1;
            objB2 = dVar.b(isoCode, cVar);
            if (objB2 != objE) {
                params2 = params;
            }
            return objE;
        }
        if (i25 == 1) {
            params2 = (Params) cVar.f211449d;
            u.b(objB2);
        } else {
            if (i25 == 2) {
                i17 = cVar.f211455k;
                i18 = cVar.f211454j;
                countryDetails = (CountryDetails) cVar.f211451f;
                iVar = (i) cVar.f211450e;
                params3 = (Params) cVar.f211449d;
                u.b(objB2);
                bitmap = (Bitmap) ((i) objB2).a();
                int i26 = i18;
                i15 = i17;
                countryDetails2 = countryDetails;
                i16 = i26;
                map = countryDetails2.getMap();
                if (map != null) {
                    b00.c cVar2 = this.imageConverter;
                    cVar.f211449d = vq.j.a(params3);
                    cVar.f211450e = vq.j.a(iVar);
                    cVar.f211451f = countryDetails2;
                    cVar.f211452g = vq.j.a(map);
                    cVar.f211453h = bitmap;
                    cVar.f211454j = i16;
                    cVar.f211455k = i15;
                    cVar.f211456l = 0;
                    cVar.f211459p = 3;
                    objB = cVar2.b(map, cVar);
                    if (objB != objE) {
                        bitmap4 = bitmap;
                        objB2 = objB;
                    }
                    return objE;
                }
                bitmap2 = bitmap;
                bitmap3 = null;
                int expiryMonths = countryDetails2.getExpiryMonths();
                String isoCode2 = countryDetails2.getIsoCode();
                String name = countryDetails2.getName();
                it = countryDetails2.i().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((Warning) next).getType() != n.COUNTRY);
                warning = (Warning) next;
                if (warning != null) {
                    warningFormattedH = h(warning);
                } else {
                    warningFormattedH = null;
                }
                List<Warning> listI = countryDetails2.i();
                arrayList = new ArrayList();
                for (Object obj : listI) {
                    if (((Warning) obj).getType() == n.REGION) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList3 = new ArrayList(v.y(arrayList, 10));
                    it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(h((Warning) it4.next()));
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = null;
                }
                LocalDate updatedDate = countryDetails2.getUpdatedDate();
                return new i.Right(new CountryDetailsFormatted(expiryMonths, isoCode2, name, warningFormattedH, arrayList2, bitmap2, bitmap3, updatedDate != null ? d(this.dateFormatter, updatedDate) : null, f(countryDetails2)));
            }
            if (i25 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap4 = (Bitmap) cVar.f211453h;
            countryDetails2 = (CountryDetails) cVar.f211451f;
            u.b(objB2);
        }
        bitmap3 = (Bitmap) ((i) objB2).a();
        bitmap2 = bitmap4;
        int expiryMonths2 = countryDetails2.getExpiryMonths();
        String isoCode3 = countryDetails2.getIsoCode();
        String name2 = countryDetails2.getName();
        it = countryDetails2.i().iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Warning) next).getType() != n.COUNTRY);
        warning = (Warning) next;
        if (warning != null) {
            warningFormattedH = h(warning);
        } else {
            warningFormattedH = null;
        }
        List<Warning> listI2 = countryDetails2.i();
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            if (((Warning) obj).getType() == n.REGION) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList(v.y(arrayList, 10));
            it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList3.add(h((Warning) it4.next()));
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        LocalDate updatedDate2 = countryDetails2.getUpdatedDate();
        return new i.Right(new CountryDetailsFormatted(expiryMonths2, isoCode3, name2, warningFormattedH, arrayList2, bitmap2, bitmap3, updatedDate2 != null ? d(this.dateFormatter, updatedDate2) : null, f(countryDetails2)));
        iVar = (i) objB2;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        countryDetails = (CountryDetails) ((i.Right) iVar).b();
        String flag = countryDetails.getFlag();
        if (flag == null) {
            params3 = params2;
            countryDetails2 = countryDetails;
            i15 = 0;
            i16 = 0;
            bitmap = null;
            map = countryDetails2.getMap();
            if (map != null) {
                b00.c cVar3 = this.imageConverter;
                cVar.f211449d = vq.j.a(params3);
                cVar.f211450e = vq.j.a(iVar);
                cVar.f211451f = countryDetails2;
                cVar.f211452g = vq.j.a(map);
                cVar.f211453h = bitmap;
                cVar.f211454j = i16;
                cVar.f211455k = i15;
                cVar.f211456l = 0;
                cVar.f211459p = 3;
                objB = cVar3.b(map, cVar);
                if (objB != objE) {
                    bitmap4 = bitmap;
                    objB2 = objB;
                    bitmap3 = (Bitmap) ((i) objB2).a();
                    bitmap2 = bitmap4;
                }
            } else {
                bitmap2 = bitmap;
                bitmap3 = null;
            }
            int expiryMonths3 = countryDetails2.getExpiryMonths();
            String isoCode4 = countryDetails2.getIsoCode();
            String name3 = countryDetails2.getName();
            it = countryDetails2.i().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Warning) next).getType() != n.COUNTRY);
            warning = (Warning) next;
            if (warning != null) {
                warningFormattedH = h(warning);
            } else {
                warningFormattedH = null;
            }
            List<Warning> listI3 = countryDetails2.i();
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (((Warning) obj).getType() == n.REGION) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList3 = new ArrayList(v.y(arrayList, 10));
                it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(h((Warning) it4.next()));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            LocalDate updatedDate3 = countryDetails2.getUpdatedDate();
            return new i.Right(new CountryDetailsFormatted(expiryMonths3, isoCode4, name3, warningFormattedH, arrayList2, bitmap2, bitmap3, updatedDate3 != null ? d(this.dateFormatter, updatedDate3) : null, f(countryDetails2)));
        }
        b00.c cVar4 = this.imageConverter;
        cVar.f211449d = vq.j.a(params2);
        cVar.f211450e = vq.j.a(iVar);
        cVar.f211451f = countryDetails;
        cVar.f211452g = vq.j.a(flag);
        cVar.f211454j = 0;
        cVar.f211455k = 0;
        cVar.f211456l = 0;
        cVar.f211459p = 2;
        objB2 = cVar4.b(flag, cVar);
        if (objB2 != objE) {
            params3 = params2;
            i17 = 0;
            i18 = 0;
            bitmap = (Bitmap) ((i) objB2).a();
            int i27 = i18;
            i15 = i17;
            countryDetails2 = countryDetails;
            i16 = i27;
            map = countryDetails2.getMap();
            if (map != null) {
                b00.c cVar5 = this.imageConverter;
                cVar.f211449d = vq.j.a(params3);
                cVar.f211450e = vq.j.a(iVar);
                cVar.f211451f = countryDetails2;
                cVar.f211452g = vq.j.a(map);
                cVar.f211453h = bitmap;
                cVar.f211454j = i16;
                cVar.f211455k = i15;
                cVar.f211456l = 0;
                cVar.f211459p = 3;
                objB = cVar5.b(map, cVar);
                if (objB != objE) {
                    bitmap4 = bitmap;
                    objB2 = objB;
                    bitmap3 = (Bitmap) ((i) objB2).a();
                    bitmap2 = bitmap4;
                }
            } else {
                bitmap2 = bitmap;
                bitmap3 = null;
            }
            int expiryMonths4 = countryDetails2.getExpiryMonths();
            String isoCode5 = countryDetails2.getIsoCode();
            String name4 = countryDetails2.getName();
            it = countryDetails2.i().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Warning) next).getType() != n.COUNTRY);
            warning = (Warning) next;
            if (warning != null) {
                warningFormattedH = h(warning);
            } else {
                warningFormattedH = null;
            }
            List<Warning> listI4 = countryDetails2.i();
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (((Warning) obj).getType() == n.REGION) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList3 = new ArrayList(v.y(arrayList, 10));
                it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(h((Warning) it4.next()));
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            LocalDate updatedDate4 = countryDetails2.getUpdatedDate();
            return new i.Right(new CountryDetailsFormatted(expiryMonths4, isoCode5, name4, warningFormattedH, arrayList2, bitmap2, bitmap3, updatedDate4 != null ? d(this.dateFormatter, updatedDate4) : null, f(countryDetails2)));
        }
        return objE;
    }
}
