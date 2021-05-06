package pl.pjatk.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class JazRestHomeworkController
{
    @GetMapping("/getPath/{wartosc}")
    public ResponseEntity<String> getPathVariable(@PathVariable String wartosc)
    {
        return ResponseEntity.ok(wartosc;
    }

    @GetMapping("/getParam")
    public ResponseEntity<String> getRequestParam(@RequestParam String wartosc)
    {
        return ResponseEntity.ok(wartosc);
    }

    @PostMapping("/postBody")
    public ResponseEntity<Car> postBody(@RequestBody Car car)
    {
        return ResponseEntity.ok(car);
    }

    @PutMapping("/putPath/{wartosc}")
    public ResponseEntity<String> putPath(@PathVariable String wartosc)
    {
        return ResponseEntity.ok(wartosc);
    }

    @PutMapping("/putBody")
    public ResponseEntity<Car> putParam(@RequestBody Car car)
    {
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("/deletePath/{wartosc}")
    public ResponseEntity<Void> deletePath(@PathVariable String wartosc)
    {
        return ResponseEntity.ok().build();
    }
}
