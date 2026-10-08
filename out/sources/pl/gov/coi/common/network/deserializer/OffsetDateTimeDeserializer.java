package pl.gov.coi.common.network.deserializer;

import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import ez.c;
import fz.f;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpl/gov/coi/common/network/deserializer/OffsetDateTimeDeserializer;", "Lcom/google/gson/k;", "Ljava/time/OffsetDateTime;", "Lez/c;", "dateConverter", "<init>", "(Lez/c;)V", "Lcom/google/gson/l;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/j;", "context", "b", "(Lcom/google/gson/l;Ljava/lang/reflect/Type;Lcom/google/gson/j;)Ljava/time/OffsetDateTime;", "a", "Lez/c;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OffsetDateTimeDeserializer implements k<OffsetDateTime> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c dateConverter;

    public OffsetDateTimeDeserializer(c cVar) {
        this.dateConverter = cVar;
    }

    @Override // com.google.gson.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OffsetDateTime a(l json, Type typeOfT, j context) {
        try {
            try {
                return OffsetDateTime.parse(json.i());
            } catch (ParseException unused) {
                return this.dateConverter.k(json.i(), fz.c.DASHED_REVERSED_WITH_SEC, f.POLISH);
            }
        } catch (DateTimeParseException unused2) {
            c cVar = this.dateConverter;
            String strI = json.i();
            fz.c cVar2 = fz.c.FULL_TIME_NO_SPACES;
            f fVar = f.POLISH;
            OffsetDateTime offsetDateTimeK = cVar.k(strI, cVar2, fVar);
            if (offsetDateTimeK != null) {
                return offsetDateTimeK;
            }
            OffsetDateTime offsetDateTimeK2 = this.dateConverter.k(json.i(), fz.c.DASHED_REVERSED_WITH_SEC, fVar);
            return offsetDateTimeK2 == null ? this.dateConverter.i(json.i()) : offsetDateTimeK2;
        }
    }
}
