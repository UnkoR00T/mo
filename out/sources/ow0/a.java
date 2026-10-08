package ow0;

import dx.i;
import iy.b0;
import java.time.LocalDate;
import jw0.f;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import uv0.VehicleHistoryAbroad;
import uv0.VehicleHistoryAbroadWrapper;
import uv0.h;
import uv0.o;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Low0/a;", "Lbw0/a;", "Ljw0/f;", "repository", "<init>", "(Ljw0/f;)V", "Lbw0/a$a;", "params", "Ldx/i;", "Ldx/b;", "Luv0/o;", "d", "(Lbw0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljw0/f;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements bw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f repository;

    /* JADX INFO: renamed from: ow0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3698a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f150285e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f150287g;

        C3698a(e<? super C3698a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150285e = obj;
            this.f150287g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(f fVar) {
        this.repository = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(bw0.a.Params params, e<? super i<? extends dx.b, ? extends o>> eVar) throws Throwable {
        C3698a c3698a;
        if (eVar instanceof C3698a) {
            c3698a = (C3698a) eVar;
            int i15 = c3698a.f150287g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3698a.f150287g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3698a = new C3698a(eVar);
            }
        } else {
            c3698a = new C3698a(eVar);
        }
        Object objC = c3698a.f150285e;
        Object objE = uq.b.e();
        int i16 = c3698a.f150287g;
        if (i16 == 0) {
            u.b(objC);
            f fVar = this.repository;
            String plate = params.getPlate();
            b0 vin = params.getVin();
            LocalDate firstRegistrationDate = params.getFirstRegistrationDate();
            c3698a.f150284d = j.a(params);
            c3698a.f150287g = 1;
            objC = fVar.c(plate, vin, firstRegistrationDate, c3698a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            dx.b bVar = (dx.b) ((i.Left) iVar).b();
            return bVar instanceof dx.b.g.c ? new i.Right(h.f201671b) : new i.Left(bVar);
        }
        if (iVar instanceof i.Right) {
            return new i.Right(new VehicleHistoryAbroadWrapper((VehicleHistoryAbroad) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
