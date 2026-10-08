package pl.gov.coi.common.network.serializer;

import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.s;
import com.google.gson.t;
import ez.e;
import fz.b;
import fz.c;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;", "Lcom/google/gson/t;", "Ljava/time/OffsetDateTime;", "Lez/e;", "dateFormatter", "<init>", "(Lez/e;)V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/s;", "context", "Lcom/google/gson/l;", "a", "(Ljava/time/OffsetDateTime;Ljava/lang/reflect/Type;Lcom/google/gson/s;)Lcom/google/gson/l;", "Lez/e;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ZonedDateTimeSerializer implements t<OffsetDateTime> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    public ZonedDateTimeSerializer(e eVar) {
        this.dateFormatter = eVar;
    }

    @Override // com.google.gson.t
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l b(OffsetDateTime src, Type typeOfSrc, s context) {
        if (src != null) {
            l lVarA = context != null ? context.a(this.dateFormatter.d(new b.OffsetDateTime(src), c.ZONED_DATE_TIME_SEC)) : null;
            if (lVarA != null) {
                return lVarA;
            }
        }
        return new o();
    }
}
