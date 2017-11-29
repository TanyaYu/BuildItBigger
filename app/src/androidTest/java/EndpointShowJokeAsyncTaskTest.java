import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import com.udacity.gradle.builditbigger.EndpointShowJokeAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertFalse;

/**
 * Created by Tanya Yuferova on 11/29/2017.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointShowJokeAsyncTaskTest {

    @Test
    public void showJokeAsyncTaskReturnsNonEmptyStringTest() throws Exception {
        try {
            Context context = InstrumentationRegistry.getTargetContext();
            EndpointShowJokeAsyncTask task = new EndpointShowJokeAsyncTask(context);
            String result = task.execute().get(20, TimeUnit.SECONDS);
            assertFalse(TextUtils.isEmpty(result));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
