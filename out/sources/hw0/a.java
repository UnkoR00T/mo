package hw0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.serializer.ZonedDateTimeSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000æ\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u00020/H\u0007¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u00105\u001a\u00020\bH\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u00105\u001a\u00020\u0010H\u0007¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u00105\u001a\u00020\rH\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u00105\u001a\u00020\rH\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u00105\u001a\u00020\rH\u0007¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020H2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020K2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020N2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020Q2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020T2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020Z2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020]2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020`2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020c2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020f2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020i2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020l2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020o2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020r2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020u2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020x2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0004\by\u0010zJ\u001f\u0010|\u001a\u00020{2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b|\u0010}J\"\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010~\u001a\u00020{2\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0006\u00105\u001a\u00020&H\u0007¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001b\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0006\u00105\u001a\u00020&H\u0007¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u00105\u001a\u00020&H\u0007¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\u0006\u00105\u001a\u00020)H\u0007¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u0006\u00105\u001a\u00020\u001bH\u0007¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001c\u0010¢\u0001\u001a\u00030¡\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001c\u0010¥\u0001\u001a\u00030¤\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001c\u0010¨\u0001\u001a\u00030§\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001c\u0010«\u0001\u001a\u00030ª\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001b\u0010®\u0001\u001a\u00030\u00ad\u00012\u0006\u00105\u001a\u00020,H\u0007¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001b\u0010±\u0001\u001a\u00030°\u00012\u0006\u00105\u001a\u000202H\u0007¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001b\u0010´\u0001\u001a\u00030³\u00012\u0006\u00105\u001a\u000202H\u0007¢\u0006\u0006\b´\u0001\u0010µ\u0001¨\u0006¶\u0001"}, d2 = {"Lhw0/a;", "", "<init>", "()V", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Ljw0/d;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ljw0/d;", "Lez/e;", "dateFormatter", "Ljw0/f;", "V", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/e;)Ljw0/f;", "Ljw0/b;", "K", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ljw0/b;", "Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;", "zonedDateTimeSerializer", "Lay/h;", "jsonFactory", "Lez/a;", "currentTimeProvider", "Lez/c;", "dateConverter", "Ljw0/e;", "U", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;Lay/h;Lez/a;Lez/c;)Ljw0/e;", "Lay/o;", "sseManagerFactory", "Lay/j;", "jsonSerializer", "Lpx/d;", "remoteLogger", "Lov0/a;", "vehicleServiceEndpoints", "Ljw0/c;", "N", "(Lay/o;Lay/j;Lpx/d;Lov0/a;)Ljw0/c;", "Ljw0/a;", "n", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ljw0/a;", "Ljw0/h;", "X", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ljw0/h;", "Ljw0/g;", "W", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ljw0/g;", "Ljw0/i;", "Y", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)Ljw0/i;", "repository", "Lcw0/b;", "v", "(Ljw0/g;)Lcw0/b;", "Lzv0/a;", "p", "(Ljw0/d;)Lzv0/a;", "Lyv0/a;", "z", "(Ljw0/b;)Lyv0/a;", "Lbw0/a;", ip.a.f96138c, "(Ljw0/f;)Lbw0/a;", "Lbw0/c;", "F", "(Ljw0/f;)Lbw0/c;", "Lbw0/b;", "E", "(Ljw0/f;)Lbw0/b;", "Law0/x;", "C", "(Ljw0/e;)Law0/x;", "Law0/y;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljw0/e;)Law0/y;", "Law0/q;", "m", "(Ljw0/e;)Law0/q;", "Law0/z;", "I", "(Ljw0/e;)Law0/z;", "Law0/a;", "e", "(Ljw0/e;)Law0/a;", "Law0/p;", "l", "(Ljw0/e;)Law0/p;", "Law0/u;", "x", "(Ljw0/e;)Law0/u;", "Law0/v;", "y", "(Ljw0/e;)Law0/v;", "Law0/f;", "A", "(Ljw0/e;)Law0/f;", "Law0/d;", "g", "(Ljw0/e;)Law0/d;", "Law0/e;", "h", "(Ljw0/e;)Law0/e;", "Law0/g;", "i", "(Ljw0/e;)Law0/g;", "Law0/c0;", "O", "(Ljw0/e;)Law0/c0;", "Law0/b0;", "M", "(Ljw0/e;)Law0/b0;", "Law0/t;", "w", "(Ljw0/e;)Law0/t;", "Law0/b;", "o", "(Ljw0/e;)Law0/b;", "Law0/w;", "B", "(Ljw0/e;)Law0/w;", "Law0/l;", "R", "(Lay/h;Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;)Law0/l;", "signVehicleCollisionConfirmationStatementUC", "Law0/h;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Law0/l;Ljw0/e;)Law0/h;", "Law0/d0;", ip.a.f96137b, "(Ljw0/e;)Law0/d0;", "Law0/f0;", "d", "(Ljw0/c;)Law0/f0;", "Law0/a0;", "J", "(Ljw0/c;)Law0/a0;", "Law0/o;", "k", "(Ljw0/c;)Law0/o;", "Law0/r;", "q", "(Ljw0/e;)Law0/r;", "Law0/s;", "u", "(Ljw0/e;)Law0/s;", "Lxv0/a;", "t", "(Ljw0/a;)Lxv0/a;", "Law0/m;", "T", "(Ljw0/e;)Law0/m;", "vehicleCollisionControllerRepository", "Law0/e0;", "Q", "(Ljw0/e;)Law0/e0;", "Law0/c;", "f", "(Ljw0/e;)Law0/c;", "Law0/k;", "j", "(Ljw0/e;)Law0/k;", "Law0/i;", "a", "(Ljw0/e;)Law0/i;", "Law0/j;", "b", "(Ljw0/e;)Law0/j;", "Law0/n;", "c", "(Ljw0/e;)Law0/n;", "Lcw0/a;", "G", "(Ljw0/h;)Lcw0/a;", "Lqw0/c;", "s", "(Ljw0/i;)Lqw0/c;", "Lqw0/a;", "r", "(Ljw0/i;)Lqw0/a;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final aw0.f A(jw0.e repository) {
        return new nw0.e(repository);
    }

    public final aw0.w B(jw0.e repository) {
        return new nw0.u(repository);
    }

    public final aw0.x C(jw0.e repository) {
        return new nw0.x(repository);
    }

    public final bw0.a D(jw0.f repository) {
        return new ow0.a(repository);
    }

    public final bw0.b E(jw0.f repository) {
        return new ow0.b(repository);
    }

    public final bw0.c F(jw0.f repository) {
        return new ow0.c(repository);
    }

    public final cw0.a G(jw0.h repository) {
        return new pw0.a(repository);
    }

    public final aw0.y H(jw0.e repository) {
        return new nw0.y(repository);
    }

    public final aw0.z I(jw0.e repository) {
        return new nw0.z(repository);
    }

    public final aw0.a0 J(jw0.c repository) {
        return new nw0.a0(repository);
    }

    public final jw0.b K(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new gw0.d(httpServiceFactory, networkCallMediator);
    }

    public final aw0.h L(aw0.l signVehicleCollisionConfirmationStatementUC, jw0.e repository) {
        return new nw0.g(signVehicleCollisionConfirmationStatementUC, repository);
    }

    public final aw0.b0 M(jw0.e repository) {
        return new nw0.b0(repository);
    }

    public final jw0.c N(ay.o sseManagerFactory, ay.j jsonSerializer, px.d remoteLogger, ov0.a vehicleServiceEndpoints) {
        return new gw0.f(sseManagerFactory, jsonSerializer, remoteLogger, vehicleServiceEndpoints);
    }

    public final aw0.c0 O(jw0.e repository) {
        return new nw0.c0(repository);
    }

    public final jw0.d P(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new gw0.h(httpServiceFactory, networkCallMediator);
    }

    public final aw0.e0 Q(jw0.e vehicleCollisionControllerRepository) {
        return new nw0.e0(vehicleCollisionControllerRepository);
    }

    public final aw0.l R(ay.h jsonFactory, ZonedDateTimeSerializer zonedDateTimeSerializer) {
        return new nw0.k(jsonFactory.c(OffsetDateTime.class, zonedDateTimeSerializer));
    }

    public final aw0.d0 S(jw0.e repository) {
        return new nw0.d0(repository);
    }

    public final aw0.m T(jw0.e repository) {
        return new nw0.l(repository);
    }

    public final jw0.e U(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator, ZonedDateTimeSerializer zonedDateTimeSerializer, ay.h jsonFactory, ez.a currentTimeProvider, ez.c dateConverter) {
        return new gw0.z(httpServiceFactory, networkCallMediator, currentTimeProvider, dateConverter, zonedDateTimeSerializer, jsonFactory);
    }

    public final jw0.f V(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator, ez.e dateFormatter) {
        return new gw0.b0(httpServiceFactory, networkCallMediator, dateFormatter);
    }

    public final jw0.g W(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new gw0.d0(httpServiceFactory, networkCallMediator);
    }

    public final jw0.h X(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new gw0.f0(httpServiceFactory, networkCallMediator);
    }

    public final jw0.i Y(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new gw0.h0(httpServiceFactory, networkCallMediator);
    }

    public final aw0.i a(jw0.e vehicleCollisionControllerRepository) {
        return new nw0.h(vehicleCollisionControllerRepository);
    }

    public final aw0.j b(jw0.e vehicleCollisionControllerRepository) {
        return new nw0.i(vehicleCollisionControllerRepository);
    }

    public final aw0.n c(jw0.e vehicleCollisionControllerRepository) {
        return new nw0.m(vehicleCollisionControllerRepository);
    }

    public final aw0.f0 d(jw0.c repository) {
        return new nw0.f0(repository);
    }

    public final aw0.a e(jw0.e repository) {
        return new nw0.a(repository);
    }

    public final aw0.c f(jw0.e vehicleCollisionControllerRepository) {
        return new nw0.b(vehicleCollisionControllerRepository);
    }

    public final aw0.d g(jw0.e repository) {
        return new nw0.c(repository);
    }

    public final aw0.e h(jw0.e repository) {
        return new nw0.d(repository);
    }

    public final aw0.g i(jw0.e repository) {
        return new nw0.f(repository);
    }

    public final aw0.k j(jw0.e vehicleCollisionControllerRepository) {
        return new nw0.j(vehicleCollisionControllerRepository);
    }

    public final aw0.o k(jw0.c repository) {
        return new nw0.n(repository);
    }

    public final aw0.p l(jw0.e repository) {
        return new nw0.o(repository);
    }

    public final aw0.q m(jw0.e repository) {
        return new nw0.p(repository);
    }

    public final jw0.a n(pl.gov.coi.common.network.w httpServiceFactory, pl.gov.coi.common.network.g0 networkCallMediator) {
        return new gw0.b(httpServiceFactory, networkCallMediator);
    }

    public final aw0.b o(jw0.e repository) {
        return new nw0.q(repository);
    }

    public final zv0.a p(jw0.d repository) {
        return new mw0.a(repository);
    }

    public final aw0.r q(jw0.e repository) {
        return new nw0.r(repository);
    }

    public final qw0.a r(jw0.i repository) {
        return new qw0.b(repository);
    }

    public final qw0.c s(jw0.i repository) {
        return new qw0.d(repository);
    }

    public final xv0.a t(jw0.a repository) {
        return new kw0.a(repository);
    }

    public final aw0.s u(jw0.e repository) {
        return new nw0.s(repository);
    }

    public final cw0.b v(jw0.g repository) {
        return new pw0.b(repository);
    }

    public final aw0.t w(jw0.e repository) {
        return new nw0.t(repository);
    }

    public final aw0.u x(jw0.e repository) {
        return new nw0.v(repository);
    }

    public final aw0.v y(jw0.e repository) {
        return new nw0.w(repository);
    }

    public final yv0.a z(jw0.b repository) {
        return new lw0.a(repository);
    }
}
