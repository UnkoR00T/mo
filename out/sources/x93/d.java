package x93;

import dx.i;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import v93.Country;
import v93.CountryDetails;
import z93.Travel;
import z93.TravelPersonalData;
import z93.TravelRequestModel;
import z93.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00110\u0006H¦@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0018\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00130\u0006H¦@¢\u0006\u0004\b\u001f\u0010\u0016J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u0006H¦@¢\u0006\u0004\b!\u0010\u0016J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"0\u00062\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b#\u0010\u000eJ\u000f\u0010$\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010%¨\u0006&À\u0006\u0003"}, d2 = {"Lx93/d;", "", "", "subscribe", "", "isoCode", "Ldx/i;", "Ldx/b;", "Loq/i0;", "g", "(ZLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lz93/s;", "travelUuid", "i", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lv93/d;", "b", "", "Lz93/r;", "", "Lz93/i;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lz93/q;", "model", "j", "(Lz93/q;Ltq/e;)Ljava/lang/Object;", "travelRequestModel", "h", "(Ljava/lang/String;Lz93/q;Ltq/e;)Ljava/lang/Object;", "Lv93/c;", "a", "Lz93/p;", "c", "Ljava/io/InputStream;", "f", "e", "()Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    Object a(e<? super i<? extends dx.b, ? extends List<Country>>> eVar);

    Object b(String str, e<? super i<? extends dx.b, CountryDetails>> eVar);

    Object c(e<? super i<? extends dx.b, TravelPersonalData>> eVar);

    Object d(e<? super i<? extends dx.b, ? extends Map<r, ? extends List<Travel>>>> eVar);

    boolean e();

    Object f(String str, e<? super i<? extends dx.b, ? extends InputStream>> eVar);

    Object g(boolean z15, String str, e<? super i<? extends dx.b, i0>> eVar);

    Object h(String str, TravelRequestModel travelRequestModel, e<? super i<? extends dx.b, i0>> eVar);

    Object i(String str, e<? super i<? extends dx.b, i0>> eVar);

    Object j(TravelRequestModel travelRequestModel, e<? super i<? extends dx.b, i0>> eVar);
}
