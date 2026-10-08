package ew0;

import dx.i;
import dx.j;
import fw0.BusinessMessageDto;
import fw0.CategoryDto;
import fw0.DocumentDto;
import fw0.DriverQualificationsResponse;
import fw0.h;
import fw0.x;
import fw0.y;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import pv0.DriverQualifications;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0001*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0018\u001a\u00020\u0017*\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfw0/a0;", "Ldx/i;", "Ldx/b;", "Lpv0/a;", "d", "(Lfw0/a0;)Ldx/i;", "Lfw0/k;", "Lpv0/a$a;", "e", "(Lfw0/k;)Lpv0/a$a;", "Lfw0/w;", "Lpv0/a$b;", "a", "(Lfw0/w;)Ldx/i;", "Lfw0/x;", "Lpv0/a$b$a;", "b", "(Lfw0/x;)Ldx/i;", "Lfw0/y;", "Lpv0/a$b$b;", "c", "(Lfw0/y;)Ldx/i;", "Ljava/time/LocalDate;", "Lpv0/a$c;", "f", "(Ljava/time/LocalDate;)Lpv0/a$c;", "vehicleservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ew0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1272a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53836b;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.ISSUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.RETAINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.INVALIDATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x.EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f53835a = iArr;
            int[] iArr2 = new int[y.values().length];
            try {
                iArr2[y.DRIVING_LICENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[y.TEMPORARY_DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[y.TRAM_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[y.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            f53836b = iArr2;
        }
    }

    private static final i<dx.b, DriverQualifications.Document> a(DocumentDto documentDto) {
        i iVarB = b(documentDto.getState());
        if (iVarB instanceof i.Left) {
            return iVarB;
        }
        if (!(iVarB instanceof i.Right)) {
            throw new p();
        }
        DriverQualifications.Document.EnumC4022a enumC4022a = (DriverQualifications.Document.EnumC4022a) ((i.Right) iVarB).b();
        i iVarC = c(documentDto.getType());
        if (iVarC instanceof i.Left) {
            return iVarC;
        }
        if (!(iVarC instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(new DriverQualifications.Document(documentDto.getRegistrationAuthority(), documentDto.getSeriesAndNumber(), enumC4022a, (DriverQualifications.Document.EnumC4023b) ((i.Right) iVarC).b(), f(documentDto.getExpireDate())));
    }

    private static final i<dx.b, DriverQualifications.Document.EnumC4022a> b(x xVar) {
        Object objB;
        DriverQualifications.Document.EnumC4022a enumC4022a;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    switch (C1272a.f53835a[xVar.ordinal()]) {
                        case 1:
                            enumC4022a = DriverQualifications.Document.EnumC4022a.ISSUED;
                            break;
                        case 2:
                            enumC4022a = DriverQualifications.Document.EnumC4022a.LOST;
                            break;
                        case 3:
                            enumC4022a = DriverQualifications.Document.EnumC4022a.RETAINED;
                            break;
                        case 4:
                            enumC4022a = DriverQualifications.Document.EnumC4022a.INVALIDATED;
                            break;
                        case 5:
                            enumC4022a = DriverQualifications.Document.EnumC4022a.DESTROYED;
                            break;
                        case 6:
                            enumC4022a = DriverQualifications.Document.EnumC4022a.EXPIRED;
                            break;
                        case 7:
                            aVar.b(new dx.b.Generic(null, 1, null));
                            throw new oq.g();
                        default:
                            throw new p();
                    }
                    return new i.Right(enumC4022a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private static final i<dx.b, DriverQualifications.Document.EnumC4023b> c(y yVar) {
        Object objB;
        DriverQualifications.Document.EnumC4023b enumC4023b;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C1272a.f53836b[yVar.ordinal()];
                    if (i15 == 1) {
                        enumC4023b = DriverQualifications.Document.EnumC4023b.DRIVING_LICENCE;
                    } else if (i15 == 2) {
                        enumC4023b = DriverQualifications.Document.EnumC4023b.TEMPORARY_DRIVING_LICENCE;
                    } else {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Generic(null, 1, null));
                            throw new oq.g();
                        }
                        enumC4023b = DriverQualifications.Document.EnumC4023b.TRAM_LICENCE;
                    }
                    return new i.Right(enumC4023b);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, DriverQualifications> d(DriverQualificationsResponse driverQualificationsResponse) {
        i iVarA = a(driverQualificationsResponse.getDocument());
        if (iVarA instanceof i.Left) {
            return iVarA;
        }
        if (!(iVarA instanceof i.Right)) {
            throw new p();
        }
        DriverQualifications.Document document = (DriverQualifications.Document) ((i.Right) iVarA).b();
        List<BusinessMessageDto> listA = driverQualificationsResponse.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((BusinessMessageDto) obj).getType() == h.CATEGORY_STATE_REASON_CHANGE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((BusinessMessageDto) it.next()).getMessage());
        }
        List<BusinessMessageDto> listA2 = driverQualificationsResponse.a();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listA2) {
            if (((BusinessMessageDto) obj2).getType() == h.OVERALL_STATEMENT) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(v.y(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((BusinessMessageDto) it4.next()).getMessage());
        }
        List<CategoryDto> listB = driverQualificationsResponse.b();
        ArrayList arrayList5 = new ArrayList(v.y(listB, 10));
        Iterator<T> it5 = listB.iterator();
        while (it5.hasNext()) {
            arrayList5.add(e((CategoryDto) it5.next()));
        }
        return new i.Right(new DriverQualifications(arrayList2, arrayList4, arrayList5, document));
    }

    private static final DriverQualifications.Category e(CategoryDto categoryDto) {
        return new DriverQualifications.Category(categoryDto.getName(), f(categoryDto.getExpireDate()));
    }

    private static final DriverQualifications.c f(LocalDate localDate) {
        return localDate == null ? DriverQualifications.c.b.f162861a : new DriverQualifications.c.Finitely(localDate);
    }
}
