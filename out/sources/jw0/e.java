package jw0;

import iy.b0;
import java.util.List;
import java.util.Set;
import oq.i0;
import p071kotlin.Metadata;
import sv0.AutomaticReportRequest;
import sv0.AutomaticReportSuccessResponse;
import sv0.BEVehicleData;
import sv0.CollisionCreatedDescription;
import sv0.FileImageConfiguration;
import sv0.InsuranceProviderData;
import sv0.NewCollision;
import sv0.NewVehicleCollisionDescription;
import sv0.ProcessId;
import sv0.ProcessNewCollision;
import sv0.StatementPersonalData;
import sv0.StatementVehicleData;
import sv0.UfgFormReportDetails;
import sv0.VehicleCollisionFileName;
import sv0.a0;
import sv0.c0;
import sv0.h0;
import sv0.m;
import sv0.o;
import sv0.t;
import sv0.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\n\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0018\u0010\u0012J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0019\u0010\u0012J,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u001f\u0010\u0012J$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b!\u0010\u0012J4\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b&\u0010'J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b)\u0010\u0012J\"\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u0004H¦@¢\u0006\u0004\b,\u0010-J4\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H¦@¢\u0006\u0004\b2\u00103J$\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002040\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b5\u0010\u0012J$\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b6\u0010\u0012J,\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\"H¦@¢\u0006\u0004\b8\u00109J$\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020:0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b;\u0010\u0012J$\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002040\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b<\u0010\u0012J,\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=H¦@¢\u0006\u0004\b?\u0010@J\u001c\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020A0\u0004H¦@¢\u0006\u0004\bB\u0010-J$\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020C0\u00042\u0006\u0010>\u001a\u00020=H¦@¢\u0006\u0004\bD\u0010EJ$\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020F0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\bG\u0010\u0012J,\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020J0\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020HH¦@¢\u0006\u0004\bK\u0010LJ8\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0*0\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0*H¦@¢\u0006\u0004\bO\u0010PJ$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Q0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\bR\u0010\u0012J$\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\bT\u0010\u0012J$\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020U0\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\bV\u0010\u0012J0\u0010Y\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0W0\u00042\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000e0WH¦@¢\u0006\u0004\bY\u0010Z¨\u0006[À\u0006\u0003"}, d2 = {"Ljw0/e;", "", "Lsv0/v;", "newCollision", "Ldx/i;", "Ldx/b;", "Lsv0/z;", "e", "(Lsv0/v;Ltq/e;)Ljava/lang/Object;", "Lsv0/t;", "data", "Lsv0/u;", "i", "(Lsv0/t;Ltq/e;)Ljava/lang/Object;", "Lsv0/y;", "processId", "Lsv0/h0;", "d", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Lsv0/w;", "Loq/i0;", "g", "(Lsv0/w;Ltq/e;)Ljava/lang/Object;", "Lsv0/i;", "n", "s", "Lsv0/a0;", "rejectionReason", "w", "(Lsv0/y;Lsv0/a0;Ltq/e;)Ljava/lang/Object;", "Lsv0/o;", "B", "Lsv0/f;", "q", "Liy/b0;", "registrationNumber", "vin", "Lsv0/e;", "c", "(Liy/b0;Liy/b0;Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Lsv0/q;", "v", "", "Lsv0/s;", "m", "(Ltq/e;)Ljava/lang/Object;", "Lsv0/e0;", "statementPersonalData", "Lsv0/i0;", "statementVehicleData", "j", "(Lsv0/y;Lsv0/e0;Lsv0/i0;Ltq/e;)Ljava/lang/Object;", "Lsv0/c0;", "t", "f", "signedRequest", "y", "(Lsv0/y;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lsv0/c0$b$a;", "k", "b", "", "pageId", "z", "(Lsv0/y;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lsv0/m$a;", "h", "Lsv0/m$b;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lsv0/b;", "o", "Lsv0/c;", "automaticReportRequest", "Lsv0/d;", "l", "(Lsv0/y;Lsv0/c;Ltq/e;)Ljava/lang/Object;", "Lsv0/o0;", "fileName", "u", "(Lsv0/y;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lsv0/c0$b$c;", "x", "Lsv0/l0;", "p", "Lsv0/c0$b$b;", "A", "", "listProcess", "r", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    Object A(ProcessId processId, tq.e<? super dx.i<? extends dx.b, c0.b.RegeneratedStatement>> eVar);

    Object B(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends o>> eVar);

    Object a(String str, tq.e<? super dx.i<? extends dx.b, m.Next>> eVar);

    Object b(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends c0>> eVar);

    Object c(b0 b0Var, b0 b0Var2, ProcessId processId, tq.e<? super dx.i<? extends dx.b, BEVehicleData>> eVar);

    Object d(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends h0>> eVar);

    Object e(NewCollision newCollision, tq.e<? super dx.i<? extends dx.b, ProcessNewCollision>> eVar);

    Object f(ProcessId processId, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object g(NewVehicleCollisionDescription newVehicleCollisionDescription, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object h(tq.e<? super dx.i<? extends dx.b, m.First>> eVar);

    Object i(t tVar, tq.e<? super dx.i<? extends dx.b, u>> eVar);

    Object j(ProcessId processId, StatementPersonalData statementPersonalData, StatementVehicleData statementVehicleData, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object k(ProcessId processId, tq.e<? super dx.i<? extends dx.b, c0.b.Finished>> eVar);

    Object l(ProcessId processId, AutomaticReportRequest automaticReportRequest, tq.e<? super dx.i<? extends dx.b, AutomaticReportSuccessResponse>> eVar);

    Object m(tq.e<? super dx.i<? extends dx.b, ? extends List<InsuranceProviderData>>> eVar);

    Object n(ProcessId processId, tq.e<? super dx.i<? extends dx.b, CollisionCreatedDescription>> eVar);

    Object o(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends sv0.b>> eVar);

    Object p(ProcessId processId, tq.e<? super dx.i<? extends dx.b, UfgFormReportDetails>> eVar);

    Object q(ProcessId processId, tq.e<? super dx.i<? extends dx.b, sv0.f>> eVar);

    Object r(Set<ProcessId> set, tq.e<? super dx.i<? extends dx.b, ? extends Set<ProcessId>>> eVar);

    Object s(ProcessId processId, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object t(ProcessId processId, tq.e<? super dx.i<? extends dx.b, ? extends c0>> eVar);

    Object u(ProcessId processId, List<VehicleCollisionFileName> list, tq.e<? super dx.i<? extends dx.b, ? extends List<VehicleCollisionFileName>>> eVar);

    Object v(ProcessId processId, tq.e<? super dx.i<? extends dx.b, FileImageConfiguration>> eVar);

    Object w(ProcessId processId, a0 a0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object x(ProcessId processId, tq.e<? super dx.i<? extends dx.b, c0.b.ReportedToUfo>> eVar);

    Object y(ProcessId processId, b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object z(ProcessId processId, String str, tq.e<? super dx.i<? extends dx.b, sv0.f>> eVar);
}
