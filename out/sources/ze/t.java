package ze;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    static t a(long j15) {
        return new k(j15);
    }

    public static t b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        t tVarA = a(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return tVarA;
                    }
                    t tVarA2 = a(jsonReader.nextLong());
                    jsonReader.close();
                    return tVarA2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th4) {
            jsonReader.close();
            throw th4;
        }
    }

    public abstract long c();
}
