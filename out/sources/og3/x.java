package og3;

import df3.VehicleDetailsData;
import fe3.y4;
import gf3.DownloadPdfSetupData;
import p071kotlin.Metadata;
import se3.InsuranceDetailsData;
import sv0.ProcessId;
import ve3.PersonalDetailsData;
import ye3.PhotosDetailsSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\nH&¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\nH&¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\nH&¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\nH&¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202H&¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\n2\u0006\u0010#\u001a\u000206H&¢\u0006\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>À\u0006\u0003"}, d2 = {"Log3/x;", "Lzx/d;", "Log3/w$c;", "Lfe3/t0;", "Log3/a;", "Llf3/a;", "Ltf3/b;", "Lvg3/a;", "Lfe3/y4;", "destination", "Loq/i0;", "A2", "(Lfe3/y4;)V", "e4", "()V", "A", "B1", "Lsv0/y;", "processId", "L4", "(Lsv0/y;)V", "m8", "h3", "U4", "b7", "x5", "Lxi3/b;", "model", "u1", "(Lxi3/b;)V", "Lse3/a;", "insuranceDetailsData", "s4", "(Lse3/a;)V", "Lye3/b;", "data", "O7", "(Lye3/b;)V", "Ldf3/a;", "vehicleDetailsData", "d4", "(Ldf3/a;)V", "Lve3/a;", "personalDetailsData", "O5", "(Lve3/a;)V", "Lsv0/s0;", "status", "O4", "(Lsv0/y;Lsv0/s0;)V", "Lyd3/f;", "recoveredNewCollision", "Z1", "(Lyd3/f;)V", "Lgf3/a;", "w5", "(Lgf3/a;)V", "Lxw/b;", "Log3/w$c$j;", "g", "()Lxw/b;", "nestedNavAction", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface x extends zx.d<w.c, fe3.t0>, a, lf3.a, tf3.b, vg3.a {
    void A();

    void A2(y4 destination);

    void B1();

    void L4(ProcessId processId);

    void O4(ProcessId processId, sv0.s0 status);

    void O5(PersonalDetailsData personalDetailsData);

    void O7(PhotosDetailsSetupData data);

    void U4();

    void Z1(yd3.f recoveredNewCollision);

    void b7();

    void d4(VehicleDetailsData vehicleDetailsData);

    void e4();

    xw.b<w.c.j> g();

    void h3();

    void m8();

    void s4(InsuranceDetailsData insuranceDetailsData);

    void u1(xi3.b model);

    void w5(DownloadPdfSetupData data);

    void x5();
}
