package hd4;

import j34.b;
import oq.p;
import p071kotlin.Metadata;
import qy2.h;
import wm3.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhd4/a;", "Lj34/b;", "<init>", "()V", "Lrq0/b;", "documentType", "Lgx/b;", "c", "(Lrq0/b;)Lgx/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public gx.b b(rq0.b documentType) {
        if (documentType == rq0.b.d.ID_CARD) {
            return jk2.a.C2462a.f103502a;
        }
        if (documentType == rq0.b.d.DRIVING_LICENCE) {
            return ju1.a.C2508a.f105876a;
        }
        if (documentType == rq0.b.d.VEHICLE_CARD) {
            return new c.ToVehicleCard(null, 1, null);
        }
        if (documentType == rq0.b.d.FAMILY_CARD) {
            return h62.a.C1873a.f81271a;
        }
        if (documentType == rq0.b.d.DIIA_REFUGEE_CARD) {
            return ts1.a.C5011a.f191872a;
        }
        if (documentType == rq0.b.d.STUDENT_CARD) {
            return i73.a.C2133a.f89916a;
        }
        if (documentType == rq0.b.d.RAILWAY_CARD) {
            return fd3.a.C1395a.f61565a;
        }
        if (documentType == rq0.b.d.PENSIONER_CARD) {
            return ls2.a.C2929a.f120081a;
        }
        if (documentType == rq0.b.d.DEPUTY_CARD) {
            return bo1.a.C0537a.f20575a;
        }
        if (documentType == rq0.b.d.ADVOCATE_CARD) {
            return tx0.a.C5035a.f192527a;
        }
        if (documentType == rq0.b.d.MIDWIFE_CARD) {
            return h.a.f169589a;
        }
        if (documentType == rq0.b.d.NURSE_CARD) {
            return h.b.f169590a;
        }
        if (documentType instanceof rq0.b.e) {
            return new zq3.a.ToWruDocument(((rq0.b.e) documentType).getLicenceCode());
        }
        if (documentType == rq0.b.d.SCHOOL_CARD || documentType == rq0.b.d.DIIA_REFUGEE_CHILD_CARD) {
            return null;
        }
        if (documentType instanceof rq0.b.EnumC4479b) {
            return new fv1.a.ToDynamicDocument((rq0.b.EnumC4479b) documentType);
        }
        if (documentType instanceof rq0.b.c) {
            return new fv1.a.ToDynamicMultiDocument((rq0.b.c) documentType);
        }
        throw new p();
    }
}
