package ew0;

import dx.i;
import dx.j;
import fw0.StatementDto;
import fw0.VehicleInsuranceDataDto;
import fw0.VehicleInsuranceDto;
import fw0.VehicleInsuranceVerificationRequest;
import fw0.VehicleInsuranceVerificationResponse;
import fw0.t1;
import fw0.z3;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import wv0.InsuranceData;
import wv0.InsuranceVerificationDateData;
import wv0.RequestedInsuranceData;
import wv0.TopAlertData;
import wv0.VehicleIdentifierData;
import wv0.VehicleInsuranceVerificationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\b¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\t*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\t*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\t*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\t*\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u001f\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t*\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\u001d\u001a\u001f\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\"0\t*\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020%0\t*\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010$\u001a\u001f\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020'0\t*\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010$¨\u0006)"}, d2 = {"Lwv0/c;", "Lfw0/c4;", "h", "(Lwv0/c;)Lfw0/c4;", "Lwv0/c$a;", "Lfw0/z3;", "g", "(Lwv0/c$a;)Lfw0/z3;", "Lfw0/d4;", "Ldx/i;", "Ldx/b;", "Lwv0/f;", "d", "(Lfw0/d4;)Ldx/i;", "Lfw0/s1;", "Lwv0/d;", "a", "(Lfw0/s1;)Ldx/i;", "Lfw0/t1;", "Lwv0/d$a;", "b", "(Lfw0/t1;)Ldx/i;", "Lfw0/b4;", "Lwv0/a;", "c", "(Lfw0/b4;)Ldx/i;", "Lfw0/a4;", "Lwv0/b;", "f", "(Lfw0/a4;)Ldx/i;", "Lwv0/e;", "l", "Lwv0/a$a;", "e", "Lwv0/b$a;", "i", "(Lfw0/z3;)Ldx/i;", "Lwv0/e$a;", "k", "Lwv0/a$a$a;", "j", "vehicleservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53854b;

        static {
            int[] iArr = new int[t1.values().length];
            try {
                iArr[t1.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f53853a = iArr;
            int[] iArr2 = new int[z3.values().length];
            try {
                iArr2[z3.GIVEN_INSURANCE_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[z3.INSURANCE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[z3.NUMBER_PLATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[z3.VIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[z3.VEHICLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[z3.ISSUING_INSURER.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[z3.RESPONSIBLE_INSURER.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[z3.INSURANCE_END_DATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            f53854b = iArr2;
        }
    }

    private static final i<dx.b, TopAlertData> a(StatementDto statementDto) {
        i iVarB = b(statementDto.getType());
        if (iVarB instanceof i.Left) {
            return iVarB;
        }
        if (!(iVarB instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(new TopAlertData(statementDto.getTitle(), statementDto.getDescription(), (TopAlertData.a) ((i.Right) iVarB).b()));
    }

    private static final i<dx.b, TopAlertData.a> b(t1 t1Var) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (a.f53853a[t1Var.ordinal()] == 1) {
                        return new i.Right(TopAlertData.a.WARNING);
                    }
                    aVar.b(new dx.b.Generic(null, 1, null));
                    throw new oq.g();
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

    private static final i<dx.b, InsuranceData> c(VehicleInsuranceDto vehicleInsuranceDto) {
        i<dx.b, InsuranceData> right;
        List<VehicleInsuranceDataDto> listA = vehicleInsuranceDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                right = new i.Right(arrayList);
                break;
            }
            i<dx.b, InsuranceData.InsuranceValueData> iVarE = e((VehicleInsuranceDataDto) it.next());
            if (iVarE instanceof i.Left) {
                right = new i.Left<>(((i.Left) iVarE).b());
                break;
            }
            if (!(iVarE instanceof i.Right)) {
                throw new p();
            }
            arrayList.add(((i.Right) iVarE).b());
        }
        if (right instanceof i.Left) {
            return right;
        }
        if (right instanceof i.Right) {
            return new i.Right(new InsuranceData((List) ((i.Right) right).b()));
        }
        throw new p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final i<dx.b, VehicleInsuranceVerificationData> d(VehicleInsuranceVerificationResponse vehicleInsuranceVerificationResponse) {
        i<dx.b, VehicleInsuranceVerificationData> right;
        Object objB;
        i<dx.b, VehicleInsuranceVerificationData> left;
        i<dx.b, TopAlertData> iVarA;
        i iVarF = f(vehicleInsuranceVerificationResponse.getInsuranceVerificationDate());
        i iVarL = l(vehicleInsuranceVerificationResponse.getVehicleIdentifier());
        boolean z15 = iVarF instanceof i.Left;
        i iVar = iVarF;
        if (!z15) {
            if (!(iVarF instanceof i.Right)) {
                throw new p();
            }
            Object objB2 = ((i.Right) iVarF).b();
            if (!(iVarL instanceof i.Left)) {
                if (!(iVarL instanceof i.Right)) {
                    throw new p();
                }
                iVarL = new i.Right(y.a((InsuranceVerificationDateData) objB2, (VehicleIdentifierData) ((i.Right) iVarL).b()));
            }
            iVar = iVarL;
        }
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        r rVar = (r) ((i.Right) iVar).b();
        InsuranceVerificationDateData insuranceVerificationDateData = (InsuranceVerificationDateData) rVar.a();
        VehicleIdentifierData vehicleIdentifierData = (VehicleIdentifierData) rVar.b();
        List<VehicleInsuranceDto> listB = vehicleInsuranceVerificationResponse.b();
        if (listB == null) {
            listB = v.n();
        }
        List<VehicleInsuranceDto> list = listB;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                right = new i.Right(arrayList);
                break;
            }
            i<dx.b, InsuranceData> iVarC = c((VehicleInsuranceDto) it.next());
            if (iVarC instanceof i.Left) {
                right = new i.Left<>(((i.Left) iVarC).b());
                break;
            }
            if (!(iVarC instanceof i.Right)) {
                throw new p();
            }
            arrayList.add(((i.Right) iVarC).b());
        }
        if (right instanceof i.Left) {
            return right;
        }
        if (!(right instanceof i.Right)) {
            throw new p();
        }
        List list2 = (List) ((i.Right) right).b();
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    StatementDto statement = vehicleInsuranceVerificationResponse.getStatement();
                    TopAlertData topAlertDataA = (statement == null || (iVarA = a(statement)) == null) ? null : iVarA.a();
                    String queryUuid = vehicleInsuranceVerificationResponse.getQueryUuid();
                    if (queryUuid != null) {
                        left = new i.Right<>(new VehicleInsuranceVerificationData(insuranceVerificationDateData, vehicleIdentifierData, list2, queryUuid, topAlertDataA));
                        return left;
                    }
                    aVar.b(new dx.b.Generic(null, 1, null));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new i.Left((dx.b) ex.d.a(e16));
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
            left = new i.Left<>(objB);
        }
    }

    private static final i<dx.b, InsuranceData.InsuranceValueData> e(VehicleInsuranceDataDto vehicleInsuranceDataDto) {
        i iVarJ = j(vehicleInsuranceDataDto.getType());
        if (iVarJ instanceof i.Left) {
            return iVarJ;
        }
        if (iVarJ instanceof i.Right) {
            return new i.Right(new InsuranceData.InsuranceValueData((InsuranceData.InsuranceValueData.EnumC5718a) ((i.Right) iVarJ).b(), vehicleInsuranceDataDto.getName(), vehicleInsuranceDataDto.getValue(), vehicleInsuranceDataDto.getAdditionalValue()));
        }
        throw new p();
    }

    private static final i<dx.b, InsuranceVerificationDateData> f(VehicleInsuranceDataDto vehicleInsuranceDataDto) {
        i iVarI = i(vehicleInsuranceDataDto.getType());
        if (iVarI instanceof i.Left) {
            return iVarI;
        }
        if (iVarI instanceof i.Right) {
            return new i.Right(new InsuranceVerificationDateData((InsuranceVerificationDateData.a) ((i.Right) iVarI).b(), vehicleInsuranceDataDto.getName(), vehicleInsuranceDataDto.getValue(), vehicleInsuranceDataDto.getAdditionalValue()));
        }
        throw new p();
    }

    private static final z3 g(RequestedInsuranceData.a aVar) {
        if (aVar instanceof RequestedInsuranceData.a.Insurance) {
            return z3.INSURANCE_NUMBER;
        }
        if (aVar instanceof RequestedInsuranceData.a.Plate) {
            return z3.NUMBER_PLATE;
        }
        if (aVar instanceof RequestedInsuranceData.a.Vehicle) {
            return z3.VIN;
        }
        throw new p();
    }

    public static final VehicleInsuranceVerificationRequest h(RequestedInsuranceData requestedInsuranceData) {
        return new VehicleInsuranceVerificationRequest(requestedInsuranceData.getDate().getDate(), g(requestedInsuranceData.getNumber()), c0.e(requestedInsuranceData.getNumber().getValue()));
    }

    private static final i<dx.b, InsuranceVerificationDateData.a> i(z3 z3Var) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (a.f53854b[z3Var.ordinal()] == 1) {
                        return new i.Right(InsuranceVerificationDateData.a.GIVEN_INSURANCE_DATE);
                    }
                    aVar.b(new dx.b.Generic(null, 1, null));
                    throw new oq.g();
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

    private static final i<dx.b, InsuranceData.InsuranceValueData.EnumC5718a> j(z3 z3Var) {
        Object objB;
        InsuranceData.InsuranceValueData.EnumC5718a enumC5718a;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = a.f53854b[z3Var.ordinal()];
                    if (i15 == 2) {
                        enumC5718a = InsuranceData.InsuranceValueData.EnumC5718a.INSURANCE_NUMBER;
                    } else if (i15 == 3) {
                        enumC5718a = InsuranceData.InsuranceValueData.EnumC5718a.NUMBER_PLATE;
                    } else if (i15 == 5) {
                        enumC5718a = InsuranceData.InsuranceValueData.EnumC5718a.VEHICLE;
                    } else if (i15 == 6) {
                        enumC5718a = InsuranceData.InsuranceValueData.EnumC5718a.ISSUING_INSURER;
                    } else if (i15 == 7) {
                        enumC5718a = InsuranceData.InsuranceValueData.EnumC5718a.RESPONSIBLE_INSURER;
                    } else {
                        if (i15 != 8) {
                            aVar.b(new dx.b.Generic(null, 1, null));
                            throw new oq.g();
                        }
                        enumC5718a = InsuranceData.InsuranceValueData.EnumC5718a.INSURANCE_END_DATE;
                    }
                    return new i.Right(enumC5718a);
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

    private static final i<dx.b, VehicleIdentifierData.a> k(z3 z3Var) {
        Object objB;
        VehicleIdentifierData.a aVar;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar2 = new ex.a();
                    int i15 = a.f53854b[z3Var.ordinal()];
                    if (i15 == 2) {
                        aVar = VehicleIdentifierData.a.INSURANCE_NUMBER;
                    } else if (i15 == 3) {
                        aVar = VehicleIdentifierData.a.NUMBER_PLATE;
                    } else {
                        if (i15 != 4) {
                            aVar2.b(new dx.b.Generic(null, 1, null));
                            throw new oq.g();
                        }
                        aVar = VehicleIdentifierData.a.VIN;
                    }
                    return new i.Right(aVar);
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

    private static final i<dx.b, VehicleIdentifierData> l(VehicleInsuranceDataDto vehicleInsuranceDataDto) {
        i iVarK = k(vehicleInsuranceDataDto.getType());
        if (iVarK instanceof i.Left) {
            return iVarK;
        }
        if (iVarK instanceof i.Right) {
            return new i.Right(new VehicleIdentifierData((VehicleIdentifierData.a) ((i.Right) iVarK).b(), vehicleInsuranceDataDto.getName(), vehicleInsuranceDataDto.getValue(), vehicleInsuranceDataDto.getAdditionalValue()));
        }
        throw new p();
    }
}
