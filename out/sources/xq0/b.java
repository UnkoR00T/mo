package xq0;

import dx.i;
import dx.j;
import ex.d;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import px.f;
import sq0.BECreateNationalCourtRegisterSubscriptionRequest;
import sq0.BENationalCourtRegister;
import sq0.BENationalCourtRegisterEntry;
import sq0.BESubscription;
import sq0.k;
import xw.c;
import yq0.CreateNationalCourtRegisterSubscriptionRequest;
import yq0.CreateNationalCourtRegisterSubscriptionResponse;
import yq0.ModifiedSubscriptionResponse;
import yq0.NationalCourtRegisterEntriesResponse;
import yq0.NationalCourtRegisterEntryDto;
import yq0.SubscriptionDto;
import yq0.UpdateNationalCourtRegisterSubscriptionRequest;
import yq0.UpdateNationalCourtRegisterSubscriptionResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\u0001*\u00020\u001f¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lyq0/w;", "Ldx/i;", "Ldx/b;", "Lsq0/g;", "c", "(Lyq0/w;)Ldx/i;", "Lyq0/x;", "Lsq0/h;", "d", "(Lyq0/x;)Ldx/i;", "Lyq0/c0;", "Lsq0/i;", "e", "(Lyq0/c0;)Ldx/i;", "Lsq0/b;", "Lyq0/c;", "h", "(Lsq0/b;)Lyq0/c;", "Lyq0/d;", "b", "(Lyq0/d;)Ldx/i;", "Lsq0/a;", "Lyq0/b;", "g", "(Lsq0/a;)Lyq0/b;", "a", "(Lyq0/b;)Ldx/i;", "Lsq0/c;", "Lyq0/d0;", "i", "(Lsq0/c;)Lyq0/d0;", "Lyq0/e0;", "Lsq0/k;", "f", "(Lyq0/e0;)Ldx/i;", "nationalcourtregistryservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f220511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f220512b;

        static {
            int[] iArr = new int[sq0.a.values().length];
            try {
                iArr[sq0.a.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sq0.a.MOBYWATEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f220511a = iArr;
            int[] iArr2 = new int[yq0.b.values().length];
            try {
                iArr2[yq0.b.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[yq0.b.MOBYWATEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[yq0.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f220512b = iArr2;
        }
    }

    public static final i<dx.b, sq0.a> a(yq0.b bVar) {
        Object objB;
        sq0.a aVar;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar2 = new ex.a();
                    int i15 = a.f220512b[bVar.ordinal()];
                    if (i15 == 1) {
                        aVar = sq0.a.EMAIL;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar2.b(new dx.b.Generic(new IllegalStateException(bVar + " is not supported")));
                            throw new g();
                        }
                        aVar = sq0.a.MOBYWATEL;
                    }
                    return new i.Right(aVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
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

    public static final i<dx.b, BESubscription> b(CreateNationalCourtRegisterSubscriptionResponse createNationalCourtRegisterSubscriptionResponse) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String strA = sq0.j.a(createNationalCourtRegisterSubscriptionResponse.getSubscriptionId());
                    fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(createNationalCourtRegisterSubscriptionResponse.getDateTo());
                    fz.b.OffsetDateTime offsetDateTime2 = new fz.b.OffsetDateTime(createNationalCourtRegisterSubscriptionResponse.getDateFrom());
                    List<yq0.b> listA = createNationalCourtRegisterSubscriptionResponse.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add((sq0.a) aVar.a(a((yq0.b) it.next())));
                    }
                    return new i.Right(new BESubscription(strA, arrayList, offsetDateTime, offsetDateTime2, createNationalCourtRegisterSubscriptionResponse.getEmail(), null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
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

    public static final i<dx.b, BENationalCourtRegister> c(NationalCourtRegisterEntriesResponse nationalCourtRegisterEntriesResponse) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<NationalCourtRegisterEntryDto> listA = nationalCourtRegisterEntriesResponse.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add((BENationalCourtRegisterEntry) aVar.a(d((NationalCourtRegisterEntryDto) it.next())));
                    }
                    List<NationalCourtRegisterEntryDto> listB = nationalCourtRegisterEntriesResponse.b();
                    ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
                    Iterator<T> it4 = listB.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add((BENationalCourtRegisterEntry) aVar.a(d((NationalCourtRegisterEntryDto) it4.next())));
                    }
                    return new i.Right(new BENationalCourtRegister(v.L0(arrayList, arrayList2), nationalCourtRegisterEntriesResponse.getMaxNumberOfSubscriptionPerPesel(), nationalCourtRegisterEntriesResponse.getMaxNumberOfDaysForSubscription()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
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

    public static final i<dx.b, BENationalCourtRegisterEntry> d(NationalCourtRegisterEntryDto nationalCourtRegisterEntryDto) {
        Object objB;
        i<dx.b, BESubscription> iVarE;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String strA = sq0.d.a(nationalCourtRegisterEntryDto.getIdKrs());
                    String number = nationalCourtRegisterEntryDto.getNumber();
                    String name = nationalCourtRegisterEntryDto.getSubject().getName();
                    String office = nationalCourtRegisterEntryDto.getSubject().getOffice();
                    SubscriptionDto subscription = nationalCourtRegisterEntryDto.getSubscription();
                    return new i.Right(new BENationalCourtRegisterEntry(strA, number, name, office, (subscription == null || (iVarE = e(subscription)) == null) ? null : (BESubscription) aVar.a(iVarE), null));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
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
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, BESubscription> e(SubscriptionDto subscriptionDto) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<yq0.b> listA = subscriptionDto.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add((sq0.a) aVar.a(a((yq0.b) it.next())));
                    }
                    return new i.Right(new BESubscription(sq0.j.a(subscriptionDto.getSubscriptionId()), arrayList, new fz.b.OffsetDateTime(subscriptionDto.getEndDate()), new fz.b.OffsetDateTime(subscriptionDto.getStartDate()), subscriptionDto.getEmail(), null));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
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
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, k> f(UpdateNationalCourtRegisterSubscriptionResponse updateNationalCourtRegisterSubscriptionResponse) {
        Object objB;
        BESubscription bESubscription;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String deletedSubscriptionId = updateNationalCourtRegisterSubscriptionResponse.getDeletedSubscriptionId();
                    String strA = deletedSubscriptionId != null ? sq0.j.a(deletedSubscriptionId) : null;
                    ModifiedSubscriptionResponse modifiedSubscription = updateNationalCourtRegisterSubscriptionResponse.getModifiedSubscription();
                    if (modifiedSubscription != null) {
                        String strA2 = sq0.j.a(modifiedSubscription.getSubscriptionId());
                        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(modifiedSubscription.getDateTo());
                        fz.b.OffsetDateTime offsetDateTime2 = new fz.b.OffsetDateTime(modifiedSubscription.getDateFrom());
                        List<yq0.b> listA = modifiedSubscription.a();
                        ArrayList arrayList = new ArrayList(v.y(listA, 10));
                        Iterator<T> it = listA.iterator();
                        while (it.hasNext()) {
                            arrayList.add((sq0.a) aVar.a(a((yq0.b) it.next())));
                        }
                        bESubscription = new BESubscription(strA2, arrayList, offsetDateTime, offsetDateTime2, modifiedSubscription.getEmail(), null);
                    } else {
                        bESubscription = null;
                    }
                    return new i.Right(new k(strA, bESubscription, null));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
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
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final yq0.b g(sq0.a aVar) {
        int i15 = a.f220511a[aVar.ordinal()];
        if (i15 == 1) {
            return yq0.b.EMAIL;
        }
        if (i15 == 2) {
            return yq0.b.MOBYWATEL;
        }
        throw new p();
    }

    public static final CreateNationalCourtRegisterSubscriptionRequest h(BECreateNationalCourtRegisterSubscriptionRequest bECreateNationalCourtRegisterSubscriptionRequest) {
        String idKrs = bECreateNationalCourtRegisterSubscriptionRequest.getIdKrs();
        LocalDate date = bECreateNationalCourtRegisterSubscriptionRequest.getDateTo().getDate();
        List<sq0.a> listA = bECreateNationalCourtRegisterSubscriptionRequest.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(g((sq0.a) it.next()));
        }
        String email = bECreateNationalCourtRegisterSubscriptionRequest.getEmail();
        if (email == null || email.length() <= 0) {
            email = null;
        }
        return new CreateNationalCourtRegisterSubscriptionRequest(arrayList, date, idKrs, email);
    }

    public static final UpdateNationalCourtRegisterSubscriptionRequest i(sq0.c cVar) {
        String subscriptionId = cVar.getSubscriptionId();
        fz.b.OffsetDateTime dateFrom = cVar.getDateFrom();
        OffsetDateTime date = dateFrom != null ? dateFrom.getDate() : null;
        fz.b.LocalDate dateTo = cVar.getDateTo();
        LocalDate date2 = dateTo != null ? dateTo.getDate() : null;
        List<sq0.a> listD = cVar.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(g((sq0.a) it.next()));
        }
        return new UpdateNationalCourtRegisterSubscriptionRequest(arrayList, subscriptionId, date, date2, cVar.getEmail());
    }
}
